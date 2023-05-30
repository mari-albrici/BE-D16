package mariannaalbrici.BED16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import lombok.extern.slf4j.Slf4j;
import config.BeansConfiguration;
import entities.Product;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
	    org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration.class
	})
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);

		log.info("HELLO WORLD!");

		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext cntxt = new AnnotationConfigApplicationContext(BeansConfiguration.class);

		Product pizza = (Product) cntxt.getBean("Margherita");
		log.info("PIZZA: " + pizza.getName() + ", prezzo: " + pizza.getPrice() + "||" + pizza.getInfo());
		
		Product pizzaPro = (Product) cntxt.getBean("prosciutto");
		log.info("PIZZAPRO: " + pizzaPro.getName() + ", prezzo: " + pizzaPro.getPrice() + "||" + pizzaPro.getInfo());

		Product pizzaChe = (Product) cntxt.getBean("cheese");
		log.info("PIZZACHE: " + pizzaChe.getName() + ", prezzo: " + pizzaChe.getPrice() + "||" + pizzaChe.getInfo());
		
		cntxt.close();
	}

}
