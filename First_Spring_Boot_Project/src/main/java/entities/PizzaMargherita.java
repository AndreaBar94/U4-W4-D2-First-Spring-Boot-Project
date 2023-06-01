package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaMargherita extends PizzaBase {

	public PizzaMargherita() {
		super("Pizza Margherita (tomato, cheese)", 4.99, 1104d);
	}
	
	@Override
    public String toString() {
        return "Pizza Margherita";
    }
}
