package com.KeycloakApp1.KeycloakApp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("")

public class LogIn {


@GetMapping("/start")
    public String start () {
    return new String("This is start. Log in <a href=\"/user\">here");
}

@GetMapping("/user")
//principal aby pobrac uzytkownika ma metode get name.
// wylogowanie ma przyjac htttp serverrequest i wylogowac
    public String user(){
    return new String("This is page for user. logout <a href=\"/logout\">here\"");
}

}