package controllers;

import com.auth.utils.JWTUtils;
import com.fasterxml.jackson.databind.JsonNode;
import dto.LoginDto;
import play.api.mvc.Request;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class LoginController  extends Controller {

    public Result login(Http.Request request){
        JsonNode jsonNode= request.body().asJson();
        if(jsonNode.has("login") && jsonNode.has("password")){
            LoginDto login = Json.fromJson(jsonNode,LoginDto.class);

            return ok("Bearer " +JWTUtils.generatePlaiTextJWT(login));
        }
        else {
            return ok("Login or Password is incorrect !");
        }
    }
}
