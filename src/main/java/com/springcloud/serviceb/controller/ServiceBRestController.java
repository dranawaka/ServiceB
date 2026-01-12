package com.springcloud.serviceb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1.0")
public class ServiceBRestController {


    @GetMapping("/service-b")
    String serviceB(){

        return "This is Service B";

    }


}
