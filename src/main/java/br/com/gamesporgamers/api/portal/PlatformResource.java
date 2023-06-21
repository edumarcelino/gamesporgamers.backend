package br.com.gamesporgamers.api.portal;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.service.BadgeService;

@Path("/api/v1/badges")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlatformResource {

    @Inject
    BadgeService badgeService;

    @GET
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }

}