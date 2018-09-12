package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.JSONResult;
import com.xx.idoctorall.entity.RequestMessage;
import com.xx.idoctorall.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
@Api(description = "WebSocket推送测试", value = "WebSocket推送测试")
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    @ApiOperation(value = "WebSocket推送测试")
    public JSONResult say(RequestMessage msg) {
        System.out.println(msg.getName());
        return JSONResult.ok(msg.getName());
    }

    @GetMapping("/ws")
    @ApiOperation(value = "WS测试")
    public ModelAndView ws(){
        ModelAndView mv = new ModelAndView("ws");
        return mv;
    }
}
