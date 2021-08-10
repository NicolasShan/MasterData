package com.woolworths.cspmasterdata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


// For automatically generate the API documents for front-end
@Configuration
public class SwaggerConfig {

    // to see API description, please go to  http://localhost:8080/swagger-ui/  to see the java document
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.woolworths.cspmasterdata.controller"))
                .build();
    }
}