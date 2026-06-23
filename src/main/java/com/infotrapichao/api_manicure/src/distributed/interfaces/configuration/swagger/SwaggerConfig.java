package com.infotrapichao.api_manicure.src.distributed.interfaces.configuration.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI photoServiceOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Manicure API")
                        .description("Api serviços de Manicures")
                        .version("2.0.0")
                        .contact(new Contact()
                                .name("Matheus Hardman")
                                .email("[EMAIL_ADDRESS]")));
    }
}

