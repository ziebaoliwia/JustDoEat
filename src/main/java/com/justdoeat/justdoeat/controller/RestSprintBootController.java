package com.justdoeat.justdoeat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSprintBootController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
