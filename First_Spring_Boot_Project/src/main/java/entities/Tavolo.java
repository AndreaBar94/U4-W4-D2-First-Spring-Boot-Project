package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tavoli")
@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int numeroTavolo;
	protected int maxNumeroCoperti;

	protected Stato stato;
	public enum Stato{
		OCCUPATO,
		LIBERO
	}
	
	
}
