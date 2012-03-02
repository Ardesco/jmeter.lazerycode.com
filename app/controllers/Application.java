package controllers;

import play.mvc.*;

import views.html.*;

import java.util.ArrayList;

public class Application extends Controller {

    public static Result index() {
        ArrayList sidebarElements = new ArrayList();
        sidebarElements.add("twitter");
        sidebarElements.add("links");
        return ok(index.render(sidebarElements));
    }

    public static Result documentation(String version, String page) {
        version = "version" + version.replaceAll("\\.", "_");
        ArrayList sidebarElements = new ArrayList();
        sidebarElements.add("twitter");
        return ok(documentation.render(sidebarElements, page));
    }

}