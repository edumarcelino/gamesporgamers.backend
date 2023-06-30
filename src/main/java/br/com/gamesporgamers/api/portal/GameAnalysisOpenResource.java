package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import br.com.gamesporgamers.entity.dto.Request.PaginatioRequestParams;
import br.com.gamesporgamers.entity.dto.Resource.GameAnalysisResourcePagination;
import br.com.gamesporgamers.service.GameAnalysisService;

@Path("/api/v1/open/gameanalysis")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GameAnalysisOpenResource {

    @Inject
    GameAnalysisService gameAnalysisService;

    @POST
    @Path("/paginated")
    public GameAnalysisResourcePagination getGameAnalysisOrderedByDate(PaginatioRequestParams requestParams) {
        int page = requestParams.getPage();
        int size = requestParams.getSize();
        return gameAnalysisService.getGameAnalysisOrderedByDate(page, size);
    }

}
