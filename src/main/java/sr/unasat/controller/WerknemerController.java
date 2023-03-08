package sr.unasat.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.Werknemer;
import sr.unasat.repository.WerknemerRepository;
import sr.unasat.service.WerknemerService;

import java.util.List;

@Path("werknemer")
public class WerknemerController {
 private  WerknemerService werknemerService = new WerknemerService();

 @Path("/list")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public List<Werknemer> getAllWerknemers() {
  System.out.println(werknemerService.getWerknemers());
  return werknemerService.getWerknemers();
 }


// @Path("")
// @POST
// public String AddWerknemer


}