package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import play.libs.Json;
import play.mvc.*;




import java.util.HashMap;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;


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
        return ok(views.html.index.render());
    }


    public Result getUserMap(){
        HashMap<String , Object> user = new HashMap<>();
        user.put("name","abenidal");
        user.put("title","sotware");
        return ok(Json.toJson(user));
    }

    public Result getUserModel(){
        User user = new User(1,"afaf","benidal",27);
        return ok(Json.toJson(user));
    }

    public Result catchUserModel(Http.Request request){
       // Http.Request request = (Http.Request) request();

        JsonNode jsonNode= request.body().asJson();
        User user = Json.fromJson(jsonNode,User.class);
        return ok(Json.toJson(user));
    }


}
