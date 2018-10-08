package com.yesjehmi.demo.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public SwaggerFactoryBean get() {
        SwaggerFactoryBean swaggerFactoryBean = new SwaggerFactoryBean();
        swaggerFactoryBean.setRestInterfacePackage("com.yesjehmi.demo.controller");
        swaggerFactoryBean.setRestInterfacePaths(regex("/api/.*"));
        return swaggerFactoryBean;
    }
}

