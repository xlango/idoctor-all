package com.xx.eurekaserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServer3Application {

    @RequestMapping("/test")
    public String test(){
        return "eureka3";
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3Application.class, args);
    }
}
