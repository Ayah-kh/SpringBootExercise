package com.example.Exercise;

import com.example.Exercise.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ExerciseApplication {

    public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(ExerciseApplication.class, args);
		PizzaController pizzaController =(PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
	}

}
