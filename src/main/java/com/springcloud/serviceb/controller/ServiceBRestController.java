package com.springcloud.serviceb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBRestController {


    @GetMapping
    String serviceB(){

        return "This is Service B";

    }


}
