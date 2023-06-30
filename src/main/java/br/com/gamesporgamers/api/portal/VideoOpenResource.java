package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import br.com.gamesporgamers.entity.dto.Request.PaginatioRequestParams;
import br.com.gamesporgamers.entity.dto.Resource.VideoResourcePagination;
import br.com.gamesporgamers.service.VideoService;

@Path("/api/v1/open/videos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VideoOpenResource {

    @Inject
    VideoService videoService;

    @POST
    @Path("/paginated")
    public VideoResourcePagination getVideosOrderedByDate(PaginatioRequestParams requestParams) {
        int page = requestParams.getPage();
        int size = requestParams.getSize();
        return videoService.getVideosOrderedByDate(page, size);
    }

}
