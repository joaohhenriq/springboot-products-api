package com.products.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.products"))
				.paths(regex("/api.*")).build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("Products API REST", "User API", "1.0", "Terms of Service",
				new Contact("João Henrique Camargo", "https://www.linkedin.com/in/jo%C3%A3o-henrique-c-398813157/",
						"joao_camargo10@hotmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html", new ArrayList<>());

		return apiInfo;
	}
}
