package dev.mbo.invoicing.api.v1;

import dev.mbo.invoicing.api.v1.model.mapper.UserMapper;
import dev.mbo.invoicing.repository.UserRepository;
import lombok.extern.jbosslog.JBossLog;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

@JBossLog
@RequestScoped
@Path("/v1/users")
public class UserResource {

  @Inject
  private UserRepository userRepository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getBooks() {
    log.info("getUsers");
    final var users = userRepository.findAll();
    final var dtos = users.stream()
      .map(UserMapper.MAPPER::toDestination)
      .collect(Collectors.toList());
    return Response.ok(dtos).build();
  }

}
