package com.example.Exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(ExerciseApplication.class, args);
		Customers customers = context.getBean(Customers.class);
		customers.display();
	}

}
