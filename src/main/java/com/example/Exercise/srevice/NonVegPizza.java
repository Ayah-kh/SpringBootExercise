package com.example.Exercise.srevice;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "NonVeg Pizza";
    }
}
