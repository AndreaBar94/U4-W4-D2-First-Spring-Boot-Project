package it.epicode.be.godfather.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import it.epicode.be.godfather.model.Drink;
import it.epicode.be.godfather.model.DrinkLemonade;
import it.epicode.be.godfather.model.Franchise;
import it.epicode.be.godfather.model.FranchiseMug;
import it.epicode.be.godfather.model.Menu;
import it.epicode.be.godfather.model.Pizza;
import it.epicode.be.godfather.model.PizzaFamilySize;
import it.epicode.be.godfather.model.PizzaHawaiian;
import it.epicode.be.godfather.model.PizzaMargherita;
import it.epicode.be.godfather.model.PizzaSalami;
import it.epicode.be.godfather.model.ToppingCheese;
import it.epicode.be.godfather.model.ToppingHam;

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
