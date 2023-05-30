package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pizza extends Product {

	public Pizza(String name, double price, String info) {
		super(name, price, info);
		name = getName();
		price = getPrice();
		info = getInfo();
	}

}
