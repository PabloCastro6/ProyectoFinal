package com.agencia.reservas.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * Clase principal que inicia la aplicación de microservicio de reservas.
 */

@EntityScan(basePackages = "com.agencia.reservas.model")
@EnableJpaRepositories(basePackages = "com.agencia.reservas.repository")
@SpringBootApplication(scanBasePackages = {"com.agencia.reservas.controller", "com.agencia.reservas.service"})
public class Application {

	 /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /**
     * Define un bean de RestTemplate para realizar llamadas a otros servicios.
     *
     * @return Instancia de RestTemplate.
     */
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
