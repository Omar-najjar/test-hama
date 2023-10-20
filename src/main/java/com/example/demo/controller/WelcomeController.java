package com.example.demo.controller;


import com.example.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/welcome2")
    public String welcome2(){
        return welcomeService.getString();
    }

}
