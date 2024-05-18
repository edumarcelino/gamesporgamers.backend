package br.com.gamesporgamers.api.admin;

import java.util.List;

import org.eclipse.microprofile.jwt.JsonWebToken;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.User;

import br.com.gamesporgamers.service.PostService;
import br.com.gamesporgamers.service.UserService;
import br.com.gamesporgamers.util.TokenUtils;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/restrict/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostRestrictResource {

    @Inject
    PostService postService;

    @Inject
    UserService userService;

    @Inject
    TokenUtils tokenUtils;

    @Inject
    JsonWebToken jwt;

    @RolesAllowed("ADMIN")
    @GET
    public List<Post> listAllOrderedByDate() {
        return postService.listAllOrderedByDate();
    }

    @RolesAllowed("ADMIN")
    @POST
    @Transactional
    public Response createPost(Post post, @Context HttpHeaders headers) throws Exception {

        // Obtém o token do cabeçalho de autorização
        String authorizationHeader = headers.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            return Response.status(Response.Status.UNAUTHORIZED).entity("Authorization header must be provided")
                    .build();
        }

        String token = authorizationHeader.substring("Bearer".length()).trim();

        String username = tokenUtils.getUsernameFromToken(token);

        User user = userService.findByUsername(username);

        post.setUser(user);

        System.out.println(user);

        postService.addPost(post);
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
