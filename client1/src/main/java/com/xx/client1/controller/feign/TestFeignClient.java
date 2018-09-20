package com.xx.client1.controller.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("client2")
public interface TestFeignClient {

    @GetMapping("/test")
    public String test();
}
