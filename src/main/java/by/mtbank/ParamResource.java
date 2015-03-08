package by.mtbank;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
//import javax.json.Json;
//import javax.json.JsonObject;

@Path("presource")
public class ParamResource {

//    @Path("/{id:\\d+}\"")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public JsonObject showParam(@PathParam("id") @DefaultValue("33") int i) {
//        return Json.createObjectBuilder().add("id value", i).build();
////        return "ID is " + i;
//    }

    @Path("t/{text}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSimple(@DefaultValue("text33") @PathParam("text") String s) {
        return "Simple text is "+ s;
    }
}
