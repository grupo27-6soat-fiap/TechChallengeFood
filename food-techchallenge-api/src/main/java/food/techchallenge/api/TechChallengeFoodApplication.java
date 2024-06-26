package food.techchallenge.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TechChallengeFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechChallengeFoodApplication.class, args);
	}

}
