package com.xx.client2.controller.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client2")
public interface TestFeignClient {

    @RequestMapping("/test")
    public String test();
}
