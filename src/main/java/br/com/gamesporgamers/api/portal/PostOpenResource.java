package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.dto.PostDTORequestParams;
import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.service.BadgeService;
import br.com.gamesporgamers.service.PostService;

@Path("/api/v1/open/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostOpenResource {

    @Inject
    PostService postService;

    @Inject
    BadgeService badgeService;

    @GET
    public List<Post> listAllOrderedByDate() {
        return postService.listAllOrderedByDate();
    }

    @POST
    @Path("/bybadges")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Post> getPostsByBadgesOrderedByDate(PostDTORequestParams requestParams) {

        List<String> badgesNames = requestParams.getBadgesNames();
        int page = requestParams.getPage();
        int size = requestParams.getSize();

        return postService.getPostsByBadgesOrderedByDate(badgesNames, page, size);
    }

    @GET
    @Path("/mainpost")
    public List<Post> listLastFiveOrderedByDate() {
        return postService.listLastFiveOrderedByDate();
    }

    @GET
    @Path("/{id}")
    public Post getPostById(@PathParam("id") Long id) {
        return postService.getPostById(id);
    }

}