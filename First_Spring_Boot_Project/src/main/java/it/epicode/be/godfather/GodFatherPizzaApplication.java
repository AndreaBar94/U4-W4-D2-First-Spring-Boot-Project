package it.epicode.be.godfather;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import it.epicode.be.godfather.model.Ordine;
import it.epicode.be.godfather.model.Tavolo;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class GodFatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodFatherPizzaApplication.class, args);

		GestioneMenu stampa = new GestioneMenu();
		stampa.stampaMenu();
		stampa.testTopping();
		
	}

}
