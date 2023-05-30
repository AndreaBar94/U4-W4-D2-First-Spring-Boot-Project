package it.epicode.be.godfather.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.epicode.be.godfather.model.Ordine.StatoOrdine;
import it.epicode.be.godfather.model.Tavolo.Stato;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Runner implements CommandLineRunner{
	
			@Value("${application.costocoperto}")
		double costocoperto;
			
		@Override
	    public void run(String... args) throws Exception{
	        // Inizializza il menu
	        PizzaMargherita pizza1 = new PizzaMargherita();
	        PizzaMargherita pizza2 = new PizzaMargherita();
	        PizzaMargherita pizza3 = new PizzaMargherita();
	        PizzaMargherita pizza4 = new PizzaMargherita();

	        // Crea l'ordine
	        Map<MenuItem, String> ordine = new HashMap<>();
	        ordine.put(pizza1, "Senza formaggio");
	        ordine.put(pizza2, "Con funghi");
	        ordine.put(pizza3, "");
	        ordine.put(pizza4, "buona");

	        int numeroTavolo = 1;
	        int maxNumeroCoperti = 4;
	        Stato statoTavolo = Stato.OCCUPATO;
	        int numeroOrdine = 1;
	        StatoOrdine statoOrdine = StatoOrdine.IN_CORSO;
	        int numeroCoperti = 4;
	        LocalTime oraAcquisizione = LocalTime.now();
	        double importoTotale = (ordine.keySet().stream()
	        		.mapToDouble(MenuItem::getPrice)
	        		.sum())+ (costocoperto * numeroCoperti);
	        //creo tavolo e ordine
	        Tavolo tavolo1 = new Tavolo(numeroTavolo, maxNumeroCoperti, statoTavolo);
	        Ordine ordine1 = new Ordine(tavolo1, numeroOrdine, statoOrdine,
	                numeroCoperti, oraAcquisizione, importoTotale, ordine);

	        // Stampa l'ordine utilizzando il logger
	        log.info("Ordine: {}", ordine1.toString());
	    }
		
	
}
