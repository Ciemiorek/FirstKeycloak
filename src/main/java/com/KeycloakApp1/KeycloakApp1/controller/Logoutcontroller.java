package com.KeycloakApp1.KeycloakApp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class Logoutcontroller {


    @GetMapping("/logout")
    public RedirectView logout(HttpServletRequest httpServletRequest) throws ServletException {
        httpServletRequest.logout();
       return new RedirectView("/start");
    }
}
