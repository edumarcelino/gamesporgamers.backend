package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


import java.util.List;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.service.PostService;

@Path("/api/v1/open/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostOpenResource {

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

}