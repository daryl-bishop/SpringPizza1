package com.example.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPizzaApplication.class, args);
	}
	ApplicationContext beanBag = SpringApplication.run(SpringPizzaApplication.class, args);
	Pizzaria controller = beanBag.getBean(Pizzaria.class);
	System.out.println(controller);

	PizzaServiceList service = beanBag.getBean(PizzaServiceList.class);
	System.out.println(service);

	PizzaServiceList myService = new PizzaServiceList();
	PizzaController myController = new PizzaController(myService);
}

}
