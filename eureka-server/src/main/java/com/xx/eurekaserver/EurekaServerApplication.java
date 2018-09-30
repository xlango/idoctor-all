package com.xx.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServerApplication {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
        return restTemplate.getForObject("http://eureka-server2/test",String.class);
    }

    @GetMapping("/port")
    public String port(){ return "===================================";}

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
