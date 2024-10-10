package com.sunil;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "This is Project is Demo Banking Domain",
				description = "Backend Rest Api for Personal Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Sunil Kumar",
						email = "sunilmaku55@gmail.com",
						url = "https://github.com"
				),
				license = @License(
						name = "Sunil Tech",
						url = "https://github.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "The Java Banking Application Documentation",
				url = "https://github.com/"
				// here i have to provide git repository url
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
