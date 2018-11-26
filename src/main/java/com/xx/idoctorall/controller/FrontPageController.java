package com.xx.idoctorall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FrontPageController {

    @GetMapping("/")
    public ModelAndView login(){
        ModelAndView login=new ModelAndView("front/login");
        return login;
    }
}
