package controllers;


import play.core.j.HttpExecutionContext;
import play.mvc.Controller;
import services.UserService;

import javax.inject.Inject;

public class UserController extends Controller {



    private HttpExecutionContext ec;
    private UserService userService;


    @Inject
    public UserController(HttpExecutionContext ec, UserService userService) {
        this.userService = userService;
        this.ec = ec;
    }




}
