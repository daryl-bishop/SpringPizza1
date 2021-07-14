package com.example.pizza.service;

import java.util.List;

import com.example.pizza.rest.Pizza;

public interface PizzaService {

	public void createPizza(Pizza pizza);

	public List<Pizza> getAllPizzas();

	public Pizza getPizza(int id);

	public Pizza replacePizza(int id, Pizza newPizza);

	public String deletePizza(int id);
}
