package by.mtbank;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@Context SecurityContext sc) {

        return "You've got it!  " + sc.isSecure() + " AuSchema " + sc.getAuthenticationScheme();
    }

    @Path("xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public MyXML getXml() {
        return new MyXML(1,"one1");
    }

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyXML getJson() {
        return new MyXML(2,"two2");
    }

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_HTML)
    public Viewable getHello() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", "R");
        final List<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        map.put("items", list);

        return new Viewable("/hello.ftl", map);
    }
}
