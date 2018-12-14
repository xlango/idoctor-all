package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.Keshi;
import com.xx.idoctorall.service.impl.KeshiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Keshi save(Keshi kshi){
        return keshiService.save(kshi);
    }
}
