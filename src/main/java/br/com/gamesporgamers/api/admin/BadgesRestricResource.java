package br.com.gamesporgamers.api.admin;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.service.BadgeService;

@Path("/api/v1/restrict/badges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BadgesRestricResource {

    @Inject
    BadgeService badgeService;

    @RolesAllowed("ADMIN")
    @GET
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }

    @RolesAllowed("ADMIN")
    @GET
    @Path("/{id}")
    public Badge getBadgeById(@PathParam("id") Long id) {
        return badgeService.getBadgeById(id);
    }

    @RolesAllowed("ADMIN")
    @POST
    @Transactional
    public Response createBadge(Badge badge) {
        badgeService.addBadge(badge);
        return Response.status(Response.Status.CREATED).build();
    }

    @RolesAllowed("ADMIN")
    @PUT
    @Path("/{id}")
    @Transactional
    public Response updatePlatform(@PathParam("id") Long id, Badge updatedBadge) {
        Badge badge = badgeService.getBadgeById(id);
        if (badge == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        badge.setName(updatedBadge.getName());
        // Atualize outros atributos, se necessário
        badgeService.updateBadge(badge);
        return Response.status(Response.Status.OK).build();
    }

    @RolesAllowed("ADMIN")
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deletePlatform(@PathParam("id") Long id) {
        Badge badge = badgeService.getBadgeById(id);
        if (badge == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        badgeService.deleteBadge(badge);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}