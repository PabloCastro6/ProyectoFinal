package com.agencia.vuelos.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.agencia.vuelos")
@EnableJpaRepositories(basePackages = "com.agencia.vuelos.repository")
@EntityScan(basePackages = "com.agencia.vuelos.model")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
