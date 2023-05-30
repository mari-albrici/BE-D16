package decorators;

import entities.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class ExtraDecorator extends Product {

	public ExtraDecorator(String name, double price, String info) {
		super(name, price, info);
	}
	
	protected Product product;

	
	@Override
	public abstract String getName();

	@Override
	public abstract double getPrice();

	@Override
	public abstract String getInfo();
}
