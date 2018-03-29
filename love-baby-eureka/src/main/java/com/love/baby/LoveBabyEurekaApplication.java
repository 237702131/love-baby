package com.love.baby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LoveBabyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoveBabyEurekaApplication.class, args);
    }
}
