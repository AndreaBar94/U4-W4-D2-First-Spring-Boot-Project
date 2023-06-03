package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class PizzaBase implements Pizza {

	private final String name;
	private final Double price;
	private final Double calories;
	
	
	
	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}



	public PizzaBase(String name, Double price, Double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

}
