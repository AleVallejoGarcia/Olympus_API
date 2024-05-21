package com.olympus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main class to bootstrap the Spring Boot application
@SpringBootApplication // This annotation denotes a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
public class Application {

    // Main method to launch the Spring Boot application
    public static void main(String[] args) {
        // SpringApplication.run() method starts the Spring Boot application
        SpringApplication.run(Application.class, args);
    }
}
