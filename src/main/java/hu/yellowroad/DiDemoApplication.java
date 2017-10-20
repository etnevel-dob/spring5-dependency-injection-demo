package hu.yellowroad;

import hu.yellowroad.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		// run() returns an ApplicationContext to work with
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// take that context "and get a hold of bean" (?)
		// Spring creates that as a Spring Bean
		// name = class name with leading lowercase character
		// getBean() is not strongly typed so we have to cast it
		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();
	}
}
