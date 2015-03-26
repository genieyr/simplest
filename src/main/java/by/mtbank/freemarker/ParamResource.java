package by.mtbank.freemarker;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ParamResource {

    @GET
    @Path("presource/{id}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(MediaType.TEXT_PLAIN)
    public String showParam(@PathParam("id") int i) {
        i++;
        return "ID plus one is " + i;
    }



}
