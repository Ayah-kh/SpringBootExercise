package com.example.Exercise.controller;

import com.example.Exercise.srevice.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private VegPizza vegPizza;

//    @Autowired
//    public PizzaController (VegPizza vegPizza){
//        this.vegPizza=vegPizza;
//    }

    @Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }

    public String getPizza() {
        return vegPizza.getPizza();
    }
}
