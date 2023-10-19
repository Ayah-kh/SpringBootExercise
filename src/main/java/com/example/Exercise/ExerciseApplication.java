package com.example.Exercise;

import com.example.Exercise.controller.PizzaController;
import com.example.Exercise.srevice.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ExerciseApplication {

    public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(ExerciseApplication.class, args);
		VegPizza vegPizza = context.getBean(VegPizza.class);
		System.out.println("vegPizza.getPizza() = " + vegPizza.getPizza());
	}

}
