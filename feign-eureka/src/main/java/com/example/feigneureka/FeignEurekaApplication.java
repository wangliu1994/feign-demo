package com.example.feigneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaApplication.class, args);
    }

}
