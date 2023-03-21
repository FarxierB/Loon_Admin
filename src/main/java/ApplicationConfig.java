import sr.unasat.config.JPAConfiguration;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashMap;
import java.util.Map;


//Voorbeeld van meneer. Alles zetten in een package met sr.unasat.
@ApplicationPath("api") //parameter van een string(parent path) -->//Localhost:8080/api
public class ApplicationConfig  extends Application {
    @Override
    public Map<String, Object> getProperties(){
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages","sr.unasat.controller");
        JPAConfiguration.getEntityManager();
        return properties;
    }
}
