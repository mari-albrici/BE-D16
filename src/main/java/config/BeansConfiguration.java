package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import decorators.CheeseDecorator;
import decorators.ProsciuttoDecorator;
import entities.Pizza;
import entities.Product;

@Configuration
public class BeansConfiguration {

	@Bean
	String basicIngredients() {
		return "tomato, mozzarella";
	}
	
	@Bean(name = "Margherita")
	@Primary
	Product pizza() {
		Pizza margherita = new Pizza("margherita", 4.5, basicIngredients());
		return margherita;
	}
	
	@Bean(name = "prosciutto")
	Product prosciutto(Product product) {
		return new ProsciuttoDecorator("Prosciutto", 0.50, "+ prosciutto", product);
	}
	
	@Bean(name = "cheese")
	Product cheese(Product product) {
		return new CheeseDecorator("Cheese", 0.50, "+ cheese", product);
	}
	
}