package com.venkatesh.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwagarApiCongiration {
	
	 @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	                .info(new Info()
	                        .title("34-CURD-op-App API Documentation")
	                        .version("1.0")
	                        .description("API documentation for 34-CURD-op-App")
	                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
	    }

	
}
