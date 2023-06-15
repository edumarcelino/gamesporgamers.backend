package br.com.gamesporgamers.api.publico;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.service.PostService;

@Path("/api/v1/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    PostService postService;

    @GET
    public List<Post> getgetAllPosts() {
        return postService.getAllPosts();
    }

    @GET
    @Path("/{id}")
    public Post getPostById(@PathParam("id") Long id) {
        return postService.getPostById(id);
    }

    @POST
    @Transactional
    public Response createPost(Post post) {
        postService.addPost(post);
        return Response.status(Response.Status.CREATED).build();
    }

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