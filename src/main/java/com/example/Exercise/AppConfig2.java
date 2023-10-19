package com.example.Exercise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig2 {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
