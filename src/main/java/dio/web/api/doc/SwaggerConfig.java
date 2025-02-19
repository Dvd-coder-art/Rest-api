package dio.web.api.doc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - REST API")
                        .description("API exemplo de uso de Spring Boot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua empresa")
                                .url("https://localhost:8080"))
                        .contact(new Contact()
                                .name("Seu Nome")
                                .url("https://seusite.com.br")
                                .email("voce@seusite.com.br")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação completa")
                        .url("https://seusite.com.br/docs"));
    }
}
