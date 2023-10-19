package com.example.Exercise.controller;

import com.example.Exercise.srevice.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza() {
        return vegPizza.getPizza();
    }
}
