package com.atustb.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/micro")
public class HelloWorldController {

    @GetMapping
    public String home(){
            return "hello,this is the home of the hello-world";
    }

}
