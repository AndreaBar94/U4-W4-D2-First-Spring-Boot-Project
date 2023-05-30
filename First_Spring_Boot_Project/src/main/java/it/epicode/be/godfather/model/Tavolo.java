package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
	
	protected int numeroTavolo;
	protected int maxNumeroCoperti;

	protected Stato stato;
	public enum Stato{
		OCCUPATO,
		LIBERO
	}
	
	
}
