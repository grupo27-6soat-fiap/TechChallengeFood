package food.techchallenge.api.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Collections;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class Swaggerconfig {
	
	@Bean
	public Docket retornaSwagger() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo informacoesApi() {
		return new ApiInfo("Api - TechChallenger - Food",
				"Disponibilizando Recursos das Apis de Cadastro de Pessoas",
				"V1", "Api - Livre",
				new Contact("Grupo 27 6soat", "Henrique R., Felipe Reis, Lucas Marques e Lucas Souza", "Projeto techchallenger"),
				null, null, Collections.emptyList());
	}
}
