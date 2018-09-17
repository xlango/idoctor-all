package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.JSONResult;
import com.xx.idoctorall.entity.RequestMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
@Api(description = "WebSocket推送测试", value = "WebSocket推送测试")
public class WsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @RequestMapping("/websocket/{name}")
    public ModelAndView webSocket(@PathVariable String name, Model model){
        try{
            logger.info("跳转到websocket的页面上");
            model.addAttribute("username",name);
            ModelAndView mv = new ModelAndView("websocket");
            return mv;
        }
        catch (Exception e){
            logger.info("跳转到websocket的页面上发生异常，异常信息是："+e.getMessage());
            ModelAndView mv = new ModelAndView("error");
            return mv;
        }
    }
}
