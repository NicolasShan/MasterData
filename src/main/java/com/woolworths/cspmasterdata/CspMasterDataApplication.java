package com.woolworths.cspmasterdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class CspMasterDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(CspMasterDataApplication.class, args);
    }

}
