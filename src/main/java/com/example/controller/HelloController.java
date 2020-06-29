package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello git";
    }

    @RequestMapping("/world")
    public String world(){
        return "good good study, day day up.";
    }

    @RequestMapping("/java")
    public String java(){
        return "java";
    }
}
