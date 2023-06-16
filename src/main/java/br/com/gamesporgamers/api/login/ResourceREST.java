package br.com.gamesporgamers.api.login;

import br.com.gamesporgamers.entity.dto.MessageDTO;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/resource")
public class ResourceREST {

	@RolesAllowed("USER")
	@GET @Path("/user") @Produces(MediaType.APPLICATION_JSON)
	public Response user() {
		return Response.ok(new MessageDTO("Content for user")).build();
	}
	
	@RolesAllowed("ADMIN")
	@GET @Path("/admin") @Produces(MediaType.APPLICATION_JSON)
	public Response admin() {
		return Response.ok(new MessageDTO("Content for admin")).build();
	}
	
	@RolesAllowed({"USER", "ADMIN"})
	@GET @Path("/user-or-admin") @Produces(MediaType.APPLICATION_JSON)
	public Response userOrAdmin() {
		return Response.ok(new MessageDTO("Content for user or admin")).build();
	}
}
