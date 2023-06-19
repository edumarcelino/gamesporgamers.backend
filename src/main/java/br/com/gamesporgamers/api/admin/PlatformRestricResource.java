package br.com.gamesporgamers.api.admin;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import br.com.gamesporgamers.entity.Platform;
import br.com.gamesporgamers.service.PlatformService;

@Path("/api/v1/restrict/platforms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlatformRestricResource {

    @Inject
    PlatformService platformService;

    @RolesAllowed("ADMIN")
    @GET
    public List<Platform> getAllPlatforms() {
        return platformService.getAllPlatforms();
    }

    @RolesAllowed("ADMIN")
    @GET
    @Path("/{id}")
    public Platform getPlatformById(@PathParam("id") Long id) {
        return platformService.getPlatformById(id);
    }

    @RolesAllowed("ADMIN")
    @POST
    @Transactional
    public Response createPlatform(Platform platform) {
        platformService.addPlatform(platform);
        return Response.status(Response.Status.CREATED).build();
    }

    @RolesAllowed("ADMIN")
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

    @RolesAllowed("ADMIN")
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