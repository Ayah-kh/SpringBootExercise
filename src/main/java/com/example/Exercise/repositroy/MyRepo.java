package com.example.Exercise.repositroy;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepo {

    public String hello(){
        return "Hello Repository ";
    }
}
