package com.atustb.micro.controller;

import com.atustb.micro.config.Coach;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/micro")
@Slf4j
public class HelloWorldController {

    @Resource
    private Coach coach;

    @GetMapping
    public String home(){
            return "hello,this is the home of the hello-world";
    }

    @RequestMapping("/coach")
    public Coach getCoach(){
        return coach;
    }

}
