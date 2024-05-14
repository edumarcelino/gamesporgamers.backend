
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import jakarta.ws.rs.core.MultivaluedMap;

public class ImageUtils {

    public static void saveImageFromMultipartFormData(MultipartFormDataInput formData, String fieldName,
            String folderPath) throws IOException {
        Map<String, List<InputPart>> uploadForm = formData.getFormDataMap();
        List<InputPart> imageParts = uploadForm.get(fieldName);

        if (imageParts != null && !imageParts.isEmpty()) {
            InputPart imagePart = imageParts.get(0);

            String filename = getFileName(imagePart.getHeaders());
            byte[] imageData = imagePart.getBody(byte[].class, null);

            saveImageToFolder(imageData, filename, folderPath);
        }
    }

    private static String getFileName(MultivaluedMap<String, String> headers) {
        String[] contentDispositionHeader = headers.getFirst("Content-Disposition").split(";");
        for (String name : contentDispositionHeader) {
            if ((name.trim().startsWith("filename"))) {
                String[] tmp = name.split("=");
                return tmp[1].trim().replaceAll("\"", "");
            }
        }
        return "unknown";
    }

    private static void saveImageToFolder(byte[] imageData, String filename, String folderPath) throws IOException {
        Path imagePath = Paths.get(folderPath + filename);
        Files.write(imagePath, imageData);
    }
}
