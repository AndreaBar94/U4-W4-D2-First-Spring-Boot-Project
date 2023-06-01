package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import entities.Drink;
import entities.DrinkLemonade;
import entities.Franchise;
import entities.FranchiseMug;
import entities.Menu;
import entities.Pizza;
import entities.PizzaFamilySize;
import entities.PizzaHawaiian;
import entities.PizzaMargherita;
import entities.PizzaSalami;
import entities.ToppingCheese;
import entities.ToppingHam;

@Configuration
public class MenuConfig {
	
	@Bean
	@Scope("singleton")
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));


//		menu.getMenuDrink().add(drinkLemonade());
		
		return menu;

	}

	@Bean
	@Scope("prototype")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	@Scope("prototype")
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	@Scope("prototype")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	@Scope("prototype")
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	@Scope("prototype")
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
	
}
