package by.mtbank.freemarker;

import by.mtbank.MyXML;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by yatsevich on 3/26/2015.
 */
@Path("free")
public class TemplateHelper {


    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable getHello() {
        return new Viewable("/form/list.ftl");
    }

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String formTest() {
        return "Form is Ok";
    }

    @POST
    @Path("form")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String formAnswer(@DefaultValue("0") @FormParam("id") Integer x, @FormParam("name") String name) {
        return new MyXML(x, name).toString();
    }

}
