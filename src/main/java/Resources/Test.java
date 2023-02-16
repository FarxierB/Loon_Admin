package Resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.awt.*;

@Path("test")
public class Test {
    @Path("getText")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getText(){return "Works";}
}
