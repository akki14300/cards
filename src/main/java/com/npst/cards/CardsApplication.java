package com.npst.cards;

import com.npst.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "NpstBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Akash ",
						email = "akash@Npst.com",
						url = "https://www.Npst.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.Npst.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "NpstBank Cards microservice REST API Documentation",
				url = "https://www.Npst.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
