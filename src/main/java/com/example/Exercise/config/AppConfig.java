package com.example.Exercise.config;

import com.example.Exercise.controller.PizzaController;
import com.example.Exercise.srevice.NonVegPizza;
import com.example.Exercise.srevice.Pizza;
import com.example.Exercise.srevice.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean

    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }

}
