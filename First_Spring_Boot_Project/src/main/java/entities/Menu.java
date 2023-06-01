package entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Menu {
	
	protected final List<Pizza> menuPizza = new ArrayList<>();	
	protected final List<PizzaTopping> menuTopping = new ArrayList<>();
	protected final List<Drink> menuDrink = new ArrayList<>();
	protected final List<Franchise> menuFranchise = new ArrayList<>();

}
