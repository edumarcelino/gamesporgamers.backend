package br.com.gamesporgamers.api.admin;

import java.util.List;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.dto.PostDTO;
import br.com.gamesporgamers.service.PostService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/restrict/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostRestrictResource {

    @Inject
    PostService postService;

    @RolesAllowed("ADMIN")
    @GET
    public List<Post> listAllOrderedByDate() {
        return postService.listAllOrderedByDate();
    }

    @RolesAllowed("ADMIN")
    @POST
    @Transactional
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response createPost(PostDTO postDto, MultipartFormDataInput formData) {
        postService.addPost(postDto);
        return Response.status(Response.Status.CREATED).build();
    }

    @RolesAllowed("ADMIN")
    @PUT
    @Path("/{id}")
    @Transactional
    public Response updatePost(@PathParam("id") Long id, Post updatedPost) {
        Post post = postService.getPostById(id);
        if (post == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        post.setPostText(updatedPost.getPostText());
        post.setPostTextHTML(updatedPost.getPostTextHTML());
        // Atualize outros atributos, se necessário
        postService.updatePost(post);
        return Response.status(Response.Status.OK).build();
    }

    @RolesAllowed("ADMIN")
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deletePost(@PathParam("id") Long id) {
        Post post = postService.getPostById(id);
        if (post == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        postService.deletePost(post);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
