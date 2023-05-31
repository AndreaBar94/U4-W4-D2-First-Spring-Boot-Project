package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DrinkLemonade extends Drink {

	public DrinkLemonade() {
		super("Lemonade", 1.29, 128d);
	}

}
