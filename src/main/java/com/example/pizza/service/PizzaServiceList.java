package com.example.pizza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pizza.rest.Pizza;

@Service
public class PizzaServiceList implements PizzaService {

	private List<Pizza> pizzas = new ArrayList<>();

	@Override
	public void createPizza(Pizza pizza) {
		System.out.println(pizza);
		this.pizzas.add(pizza);
	}

	@Override
	public List<Pizza> getAllPizzas() {
		return this.pizzas;
	}

	@Override
	public Pizza getPizza(int id) {
		Pizza found = this.pizzas.get(id);
		return found;
	}

	@Override
	public Pizza replacePizza(int id, Pizza newPizza) {
		return this.pizzas.set(id, newPizza); // replace the kitten at index id
	}

	@Override
	public String deletePizza(int id) {
		this.pizzas.remove(id);

		return "Deleted Pizza at index: " + id;
	}

}