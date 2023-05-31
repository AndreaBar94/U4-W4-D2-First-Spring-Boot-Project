package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaHawaiian extends PizzaBase {

	public PizzaHawaiian() {
		super("Pizza Hawaiian (tomato, cheese, ham, pineapple)", 6.49, 1024d);
	}

}
