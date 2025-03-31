package com.milenyumsoft.proyectoauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("denyAll()")
public class GreetingsController {

    @PreAuthorize("permitAll()")
    @GetMapping("/sayhi")
    public String sayHi(){

        return "Hi, This is a not secured endpoint.";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/sayhisec")
    public String sayHisec(){

        return "Hi, This is a secured endpoint.";
    }
}
