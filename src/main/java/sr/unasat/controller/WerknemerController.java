package sr.unasat.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.Werknemer;
import sr.unasat.repository.WerknemerRepository;

import java.util.List;

@Path("werknemer/invoer")
public class WerknemerController {
 private WerknemerRepository werknemerRepository = new WerknemerRepository(JPAConfiguration.getEm());


 @Path("werknemerlist")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public List<Werknemer> getWerknemers() { return werknemerRepository.getWerknemers();}


// @Path("addwerknemer")
// @POST
// public String AddWerknemer


}
