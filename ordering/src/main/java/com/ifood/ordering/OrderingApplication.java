package com.ifood.ordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableSwagger2
@RestController
public class OrderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderingApplication.class, args);
	}

	@GetMapping("/")
	public ModelAndView  rootRedirect() {
		return new ModelAndView("redirect:/swagger-ui.html" );
	}
	
	@Bean
	public Docket orderingApis(){
		return new Docket(DocumentationType.SWAGGER_2).select()
         .apis(RequestHandlerSelectors.basePackage("com.ifood.ordering")).build()
		 .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Ordering APIs Spring Boot Backend").version("1.0.0").license("ZK Liscense").build();
    }
}
