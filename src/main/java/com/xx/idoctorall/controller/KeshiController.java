package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.Keshi;
import com.xx.idoctorall.service.impl.KeshiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/keshi")
@CrossOrigin
public class KeshiController {

    @Autowired
    private KeshiServiceImpl keshiService;

    @GetMapping("/all")
    public List<Keshi> all(){
        return keshiService.findAll();
    }
}
