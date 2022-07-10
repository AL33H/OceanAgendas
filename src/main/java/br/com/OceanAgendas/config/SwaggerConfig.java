package br.com.OceanAgendas.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI createOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Ocean Agendas")
                        .description("Aplicação para agendamentos de prestação de serviços")
                        .version("v1")
                        .contact(new Contact()
                                .name("Aleff Remberto")
                                .url("https://github.com/AL33H")))
                .externalDocs(new ExternalDocumentation()
                        .description("GitHub"));

    }
}

