package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToppingCheese extends PizzaTopping {

	public ToppingCheese(Pizza pizza) {
		super(pizza,"Cheese", 0.69, 92d);
	}

}
