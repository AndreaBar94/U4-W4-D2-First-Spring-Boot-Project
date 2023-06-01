package entities;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Component
public class Ordine{

	private int numOrdine;
	private StatoOrdine statoOrdine;
	public enum StatoOrdine{
		IN_CORSO,
		PRONTO,
		SERVITO
	}
	private int numeroCoperti;
	private LocalTime oraAcquisizione;
	private double importoTotale;
	private Map<MenuItem, String> ordine = new HashMap<>();
	private Tavolo tavolo;

	public Ordine(Tavolo tavolo, int numOrdine, StatoOrdine statoOrdine,
			int numeroCoperti, LocalTime oraAcquisizione, double importoTotale, Map<MenuItem, String> ordine) {
		
		this.tavolo = tavolo;
		this.numOrdine = numOrdine;
		this.statoOrdine = statoOrdine;
		this.numeroCoperti = numeroCoperti;
		this.oraAcquisizione = oraAcquisizione;
		this.importoTotale = importoTotale;
		this.ordine = ordine;
	}
	
	@Override
	public String toString() {
	    return 
	            "Numero: " + tavolo.getNumeroTavolo() + ", \n" + 
	            "Massimo coperti del tavolo: " + tavolo.getMaxNumeroCoperti() + ", \n" +
	            "stato del tavolo: " + tavolo.getStato() + ", \n" +
	            "numero dell'ordine: " + numOrdine + ", \n" +
	            "stato dell'ordine: " + statoOrdine + ", \n" +
	            "numero coperti del tavolo: " + numeroCoperti + ", \n" +
	            "ora acquisizione ordine: " + oraAcquisizione + ", \n" +
	            "conto: " + importoTotale + ", \n" +
	            "comanda: " + ordine;
	}
	

}
