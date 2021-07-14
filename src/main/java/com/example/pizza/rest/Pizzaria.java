package com.example.pizza.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pizzaria {

	private List<Pizza> pizzas = new ArrayList<Pizza>();

	@GetMapping("/")
	public String hello() {
		return "Mamma Mia!";

	}

	@PostMapping("/createPizza")
	public void createPizza(@RequestBody Pizza pizza) {
		this.pizzas.add(pizza);

	}

	@GetMapping("/getPizza")
	public List<Pizza> getPizza() {
		return pizzas;

	}

	@PutMapping("/getPizza/{id}")
	public Pizza getPizza(@PathVariable int id, @RequestBody Pizza newPizza) {
		Pizza found = this.pizzas.get(id);
		return found;
	}

}