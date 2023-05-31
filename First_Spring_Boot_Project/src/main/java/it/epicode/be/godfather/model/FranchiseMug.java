package it.epicode.be.godfather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FranchiseMug extends Franchise {
	
	
	public FranchiseMug() {
		super("Mug",4.99);
	}
}
