package sr.unasat.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.entity.InlogWerknemer;
import sr.unasat.entity.Werknemer;
import sr.unasat.service.InlogService;
import sr.unasat.service.WerknemerService;

import java.util.List;

@Path("/werknemer")
public class WerknemerController {
 private  WerknemerService werknemerService = new WerknemerService();

 @Path("/list")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public List<Werknemer> getWerknemers() {
  System.out.println(werknemerService.getWerknemers());
  return werknemerService.getWerknemers();
 }



// @Path("")
// @POST
// public String AddWerknemer


}