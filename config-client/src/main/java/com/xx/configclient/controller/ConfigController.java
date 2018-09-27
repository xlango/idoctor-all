package com.xx.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${from}")
    private String from;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @RequestMapping("/from")
    public String from() {
        return  this.from+"~user:" + this.username + "~pass:" + this.password;
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
