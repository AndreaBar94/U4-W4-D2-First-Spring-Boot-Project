package app;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import entities.Ordine;
import entities.Tavolo;

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
