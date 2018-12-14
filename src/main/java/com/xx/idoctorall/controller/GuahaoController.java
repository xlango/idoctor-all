package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.GuaHao;
import com.xx.idoctorall.service.GuahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guahao")
@CrossOrigin
public class GuahaoController {

    @Autowired
    private GuahaoService guahaoService;

    @GetMapping("/findNew")
    public GuaHao findNew(){
        return guahaoService.findNew();
    }

}
