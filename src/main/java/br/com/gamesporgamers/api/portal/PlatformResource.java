package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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
        return platformService.getAllCategories();
    }

    @GET
    @Path("/{id}")
    public Platform getPlatformById(@PathParam("id") Long id) {
        return platformService.getPlatformById(id);
    }

    @POST
    @Transactional
    public Response createPlatform(Platform platform) {
        platformService.addPlatform(platform);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updatePlatform(@PathParam("id") Long id, Platform updatedCategory) {
        Platform platform = platformService.getPlatformById(id);
        if (platform == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        platform.setName(updatedCategory.getName());
        // Atualize outros atributos, se necessário
        platformService.updatePlatform(platform);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deletePlatform(@PathParam("id") Long id) {
        Platform category = platformService.getPlatformById(id);
        if (category == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        platformService.deletePlatform(category);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}