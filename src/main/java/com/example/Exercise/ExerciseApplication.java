package com.example.Exercise;

import com.example.Exercise.controller.MyController;
import com.example.Exercise.controller.PizzaController;
import com.example.Exercise.lazy.LazyLoader;
import com.example.Exercise.properitySource.PropertySourceDemo;
import com.example.Exercise.repositroy.MyRepo;
import com.example.Exercise.scope.PrototypeBean;
import com.example.Exercise.scope.SingletonBean;
import com.example.Exercise.srevice.MyService;
import com.example.Exercise.srevice.VegPizza;
import com.example.Exercise.value.ValueAnnotation;
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

//		MyController myController = context.getBean(MyController.class);
//		System.out.println("myController.sayHello() = " + myController.sayHello());
//
//		MyService myService = context.getBean(MyService.class);
//		System.out.println("myService.hello() = " + myService.hello());
//
//		MyRepo myRepo = context.getBean(MyRepo.class);
//		System.out.println("myRepo.hello() = " + myRepo.hello());
//
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean singletonBean = context.getBean(SingletonBean.class);
//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);

//		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
//		System.out.println("valueAnnotation.getDefaultName() = " + valueAnnotation.getDefaultName());
//		System.out.println("valueAnnotation.getHost() = " + valueAnnotation.getHost());
//		System.out.println("valueAnnotation.getEmail() = " + valueAnnotation.getEmail());
//		System.out.println("valueAnnotation.getPassword() = " + valueAnnotation.getPassword());

		PropertySourceDemo propertySourceDemo=context.getBean(PropertySourceDemo.class);
		System.out.println("propertySourceDemo.getHost() = " + propertySourceDemo.getHost());
		System.out.println("propertySourceDemo.getEmail() = " + propertySourceDemo.getEmail());
		System.out.println("propertySourceDemo.getPassword() = " + propertySourceDemo.getPassword());
		System.out.println("propertySourceDemo.getAppName() = " + propertySourceDemo.getAppName());
		System.out.println("propertySourceDemo.getAppDescription() = " + propertySourceDemo.getAppDescription());

	}

}
