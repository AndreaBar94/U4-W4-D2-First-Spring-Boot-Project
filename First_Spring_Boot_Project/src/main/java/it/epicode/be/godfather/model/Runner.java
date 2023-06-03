package it.epicode.be.godfather.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.godfather.config.MenuConfig;
import it.epicode.be.godfather.dao.TavoloService;
import it.epicode.be.godfather.model.Ordine.StatoOrdine;
import it.epicode.be.godfather.model.Tavolo.Stato;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Runner implements CommandLineRunner{
	
		@Value("${application.costocoperto}")
		double costocoperto;
			
		private AnnotationConfigApplicationContext ctx;	
			
		@Autowired
		TavoloService tavoloService;
		
		@Override
	    public void run(String... args) throws Exception{
			ctx = new AnnotationConfigApplicationContext(MenuConfig.class);

			
	        // Inizializzo il menu
	        PizzaMargherita pizza1 = ctx.getBean(PizzaMargherita.class);
	        PizzaMargherita pizza2 = ctx.getBean(PizzaMargherita.class);
	        PizzaMargherita pizza3 = ctx.getBean(PizzaMargherita.class);
	        PizzaMargherita pizza4 = ctx.getBean(PizzaMargherita.class);
	        
	        // Creo l'ordine
	        Map<MenuItem, String> ordine = new HashMap<>();
	        ordine.put(pizza1, "Senza formaggio");
	        ordine.put(pizza2, "Con funghi");
	        ordine.put(pizza3, "lactose intolerance");
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
	        
	        try {
	        	tavoloService.save(tavolo1);
			} catch (Exception e) {
				System.out.println("Errore: " + e);
			}

	        
	        Ordine ordine1 = new Ordine(tavolo1, numeroOrdine, statoOrdine,
	                numeroCoperti, oraAcquisizione, importoTotale, ordine);

	        // Stampo l'ordine utilizzando il logger
	        log.info("Ordine: {}", ordine1.toString());
	    }
		
	
}
