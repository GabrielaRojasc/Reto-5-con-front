package com.example.proyectoortopedic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"Controller", "Model", "Repository", "Service"})
@EntityScan("Model")
@EnableJpaRepositories("Repository")
public class ProyectoOrtopedicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoOrtopedicApplication.class, args);
    }

}
