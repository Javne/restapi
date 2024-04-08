package com.javne.restapi.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("RestApi").version("1.0").description("FirstRestApi")
                        .contact(new Contact().name("Ewelina Borkowska").url("https://github.com/Javne/restapi.git").email("javaczysen@gmail.com")));
    }
}

