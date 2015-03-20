package by.mtbank.freemarker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("presource/{id}")
public class ParamResource {

    @GET
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(MediaType.TEXT_PLAIN)
    public String showParam(@PathParam("id") int i) {
        return "ID is " + i;
    }
}
