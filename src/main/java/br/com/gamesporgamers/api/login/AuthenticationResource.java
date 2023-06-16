package br.com.gamesporgamers.api.login;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.dto.auth.AuthRequestDTO;
import br.com.gamesporgamers.entity.dto.auth.AuthResponseDTO;
import br.com.gamesporgamers.service.PostService;
import br.com.gamesporgamers.service.UserService;
import br.com.gamesporgamers.util.PBKDF2Encoder;
import br.com.gamesporgamers.util.TokenUtils;
import jakarta.annotation.security.PermitAll;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/user")
public class AuthenticationResource {

    @Inject
    PBKDF2Encoder passwordEncoder;

    @Inject
    UserService userService;

    @ConfigProperty(name = "br.com.gamesporgamers.jwt.duration")
    public Long duration;

    @ConfigProperty(name = "mp.jwt.verify.issuer")
    public String issuer;

    @PermitAll
    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(AuthRequestDTO authRequest) {
        User user = userService.findByUsernameAndPassword(authRequest);
        if (user != null && user.password.equals(passwordEncoder.encode(authRequest.password))) {
            try {
                return Response
                        .ok(new AuthResponseDTO(
                                TokenUtils.generateToken(user.getUsername(), user.getRoles(), duration, issuer)))
                        .build();
            } catch (Exception e) {
                return Response.status(Status.UNAUTHORIZED).build();
            }
        } else {
            return Response.status(Status.UNAUTHORIZED).build();
        }
    }

}