package br.com.empresa.Empresa.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Empresa")
                        .description("API Rest da aplicação 'Empresa' com CRUD de funcionarios e cadastro de " +
                                "departamentos. Feito com finalidade de marcação de reuniões")
                        .contact(new Contact()
                                .name("Time Backend")
                                .email("backend@empresa"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://empresa/api/licenca")));
    }

}
