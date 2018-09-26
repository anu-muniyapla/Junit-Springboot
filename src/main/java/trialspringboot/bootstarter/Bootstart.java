package trialspringboot.bootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import trialspringboot.autowiring.Employee;

@ComponentScan("trialspringboot")
@SpringBootApplication
public class Bootstart {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Bootstart.class, args);

		Employee e = context.getBean(Employee.class);
		e.show();
	}

}
