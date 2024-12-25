package com.foton.controller;

import org.apache.catalina.core.StandardVirtualThreadExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
