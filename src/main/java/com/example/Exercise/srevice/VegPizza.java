package com.example.Exercise.srevice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VegPizza implements Pizza{

    @Override
    public String getPizza(){
        return  "VegPizza";
    }
}
