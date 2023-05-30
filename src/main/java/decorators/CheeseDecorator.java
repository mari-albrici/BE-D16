package decorators;

import entities.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheeseDecorator extends ExtraDecorator {

	public Product product;
		
		public String getName() {
			return product.getName() + " + cheese";
		}
	
		public double getPrice() {
			return product.getPrice() + 0.50;
		}
	
		public String getInfo() {
			return product.getInfo() + " + cheese";
		}
	
		public CheeseDecorator(String name, double price, String info, Product product) {
			super(name, price, info);
			this.product = product;
		}
}
