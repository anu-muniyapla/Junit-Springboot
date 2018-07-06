package trialspringboot.bootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("trialspringboot")
@SpringBootApplication
public class Bootstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SpringApplication.run(Bootstart.class, args);
	}

}
