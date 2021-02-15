package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class HealthCheck{

    @GET
    @Path("/_healthcheck")
    @Produces(MediaType.TEXT_PLAIN)
    public Response checkHealth(){
        String healthcheck = "Taxi API Service Active";
        return Response.ok(healthcheck).build();
    }
}
