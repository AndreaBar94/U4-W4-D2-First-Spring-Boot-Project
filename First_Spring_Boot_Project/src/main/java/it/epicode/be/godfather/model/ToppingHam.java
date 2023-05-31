package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToppingHam extends PizzaTopping {

	public ToppingHam(Pizza pizza) {
		super(pizza,"Ham", 0.99, 35d);
	}

}
