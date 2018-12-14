package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.nonrelation.Diagnosis;
import com.xx.idoctorall.service.DiagnsisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnosis")
@CrossOrigin
public class DiagnosisController {

    @Autowired
    private DiagnsisService diagnsisService;

    @GetMapping("/findById")
    public Diagnosis findById(Diagnosis diagnsis){
        return diagnsisService.findById(diagnsis);
    }
}
