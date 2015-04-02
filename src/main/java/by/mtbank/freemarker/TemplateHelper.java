package by.mtbank.freemarker;

import by.mtbank.MyXML;
import org.glassfish.jersey.server.mvc.Template;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yatsevich on 3/26/2015.
 */
@Path("free")
public class TemplateHelper {

    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String formTest() {
        return "Form is Ok";
    }

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/hello.ftl")
    public Map<String, Object> getHello() {
        final Map<String, Object> map = new HashMap<>();
        map.put("user", "R");
        final List<String> list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        map.put("items", list);
        return map;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable getTest() {
        return new Viewable("/form/list.ftl", "AsModel");
    }

    @POST
    @Path("form")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public MyXML formAnswer(@DefaultValue("0") @FormParam("id") Integer x, @FormParam("name") String name) {
        return new MyXML(x, name);//.toString();
    }

}
