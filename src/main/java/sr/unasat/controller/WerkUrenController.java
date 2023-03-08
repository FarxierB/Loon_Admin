package sr.unasat.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.entity.WerkUren;
import sr.unasat.entity.Werknemer;
import sr.unasat.service.WerkUrenService;

import java.util.List;

@Path("werkuren")
public class WerkUrenController {

    private WerkUrenService werkUrenService = new WerkUrenService();

    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<WerkUren> getWerkUrenLijst() {
        System.out.println(werkUrenService.getWerkUrenLijst());
        return werkUrenService.getWerkUrenLijst();
    }
}
