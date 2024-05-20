package br.com.gamesporgamers.api.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import br.com.gamesporgamers.util.ImageUploadForm;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/restrict/upload")
public class ImageUploadResource {

  private static final String UPLOAD_DIR = "src/main/resources/META-INF/resources/uploads/";

  static {
    // Cria o diretório de upload se ele não existir
    new File(UPLOAD_DIR).mkdirs();
  }

  @RolesAllowed("ADMIN")
  @POST
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces(MediaType.APPLICATION_JSON)
  public Response uploadImage(@MultipartForm ImageUploadForm form) {
    try {
      if (form.getFileContent() == null) {
        // Handle the case where no file was uploaded (e.g., log a message or return an error response)
        return Response.status(Response.Status.BAD_REQUEST)
            .entity("No file uploaded.")
            .build();
      }

      String fileName = UUID.randomUUID().toString() + ".png";
      InputStream fileContent = form.getFileContent();
      saveFile(fileContent, UPLOAD_DIR + fileName);
      String fileUrl = "http://localhost:8080/uploads/" + fileName;
      return Response.ok().entity("{\"url\": \"" + fileUrl + "\"}").build();
    } catch (IOException e) {
      // Handle other exceptions
      e.printStackTrace();
      return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao fazer upload da imagem.")
          .build();
    }
  }

  private void saveFile(InputStream uploadedInputStream, String serverLocation) throws IOException {
    // Cria um buffer de leitura para melhorar a eficiência
    try (FileOutputStream out = new FileOutputStream(new File(serverLocation))) {
      int read;
      byte[] bytes = new byte[1024];
      while ((read = uploadedInputStream.read(bytes)) != -1) {
        out.write(bytes, 0, read);
      }
    } finally {
      uploadedInputStream.close();
    }
  }
}
