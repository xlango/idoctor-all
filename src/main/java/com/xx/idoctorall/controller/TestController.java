package com.xx.idoctorall.controller;

import com.netflix.discovery.DiscoveryClient;
import com.xx.idoctorall.entity.JSONResult;
import com.xx.idoctorall.entity.User;
import com.xx.idoctorall.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/test")
@Api(description = "用户管理", value = "用户管理")
@CrossOrigin
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/test")
    @ApiOperation(value = "测试eureka")
    public String test() {
        return restTemplate.getForObject("http://diagnosis-server/test/test",String.class);
    }

    @PostMapping("/u")
    @ApiOperation(value = "查询用户")
    public JSONResult u(@RequestBody User user) {
        return  JSONResult.ok(userService.findAllByUsername(user.getUsername()));
    }


}
