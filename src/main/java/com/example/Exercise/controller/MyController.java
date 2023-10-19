package com.example.Exercise.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        return "Hello controller";
    }
}
