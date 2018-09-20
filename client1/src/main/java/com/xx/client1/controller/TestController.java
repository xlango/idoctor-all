package com.xx.client1.controller;

import com.xx.client1.controller.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

    @GetMapping("/test1")
    public String test1(){
        return "Client1";
    }

    @GetMapping("/test")
    public String test(){
        return testFeignClient.test();
    }
}
