package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import br.com.gamesporgamers.entity.Platform;
import br.com.gamesporgamers.service.PlatformService;

@Path("/api/v1/platforms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlatformResource {

    @Inject
    PlatformService platformService;

    @GET
    public List<Platform> getAllPlatforms() {
        return platformService.getAllPlatforms();
    }

}