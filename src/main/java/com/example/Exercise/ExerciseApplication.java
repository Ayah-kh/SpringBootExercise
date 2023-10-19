package com.example.Exercise;

import com.example.Exercise.controller.MyController;
import com.example.Exercise.controller.PizzaController;
import com.example.Exercise.lazy.LazyLoader;
import com.example.Exercise.repositroy.MyRepo;
import com.example.Exercise.srevice.MyService;
import com.example.Exercise.srevice.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ExerciseApplication {

    public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(ExerciseApplication.class, args);
//		VegPizza vegPizza = (VegPizza) context.getBean("VegPizzaBean");
//		System.out.println("vegPizza.getPizza() = " + vegPizza.getPizza());

//		PizzaController pizzaController= context.getBean(PizzaController.class);
//		System.out.println("pizzaController.getPizza() = " + pizzaController.getPizza());

		MyController myController = context.getBean(MyController.class);
		System.out.println("myController.sayHello() = " + myController.sayHello());

		MyService myService = context.getBean(MyService.class);
		System.out.println("myService.hello() = " + myService.hello());

		MyRepo myRepo = context.getBean(MyRepo.class);
		System.out.println("myRepo.hello() = " + myRepo.hello());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

	}

}
