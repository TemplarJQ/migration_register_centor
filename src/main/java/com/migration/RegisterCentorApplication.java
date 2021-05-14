package com.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterCentorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCentorApplication.class, args);
        System.out.println( "Eureka Register Centor running!" );
    }
}
