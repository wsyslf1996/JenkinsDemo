package com.example.controller;

import com.example.config.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @Autowired
    private Environment environment;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hi, this is " + environment.getEnvironment();
    }
}
