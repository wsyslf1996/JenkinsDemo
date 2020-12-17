package com.example.controller;

import com.example.config.EnvironmentDes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Autowired
    private EnvironmentDes environmentDes;

    @GetMapping(value = "/helloworld")
    @ResponseBody
    public String helloWorld(){
        return "Hi, this is " + environmentDes.getEnvironment();
//        return "Hello, World!";
    }
}
