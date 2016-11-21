package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Hello World"));
    }

    public Result BMI() {
        return ok(BMI.render("Hello World"));

    }

    public Result Exercise() {
        return ok(Exercise.render("Hello World"));

    }

    public Result contact() {
        return ok(contact.render("Hello World"));

    }

     public Result Breakfast() {
        return ok(Breakfast.render("Hello World"));

    }

     public Result Lunch() {
        return ok(Lunch.render("Hello World"));

    }

     public Result Dinner() {
        return ok(Dinner.render("Hello World"));

    }






        

}
