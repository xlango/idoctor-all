package com.xx.eurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServer2Application {

    @RequestMapping("/test")
    public String test(){
        return "eureka2";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }
}
