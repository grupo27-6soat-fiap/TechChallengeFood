package food.techchallenge.api.config;

import org.springframework.boot.SpringApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
}
