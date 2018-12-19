package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.nonrelation.Case;
import com.xx.idoctorall.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/case")
@CrossOrigin
public class CaseController {

    @Autowired
    private CaseService caseService;

    @PostMapping("/save")
    public Case save(Case c){
        c.setTime(new Date());
        return caseService.save(c);
    }

    @GetMapping("/findAll")
    public List<Case> findAll(){
        return caseService.findAll();
    }

    @GetMapping("/findByPid")
    public List<Case> findByPid(int pid){
        return caseService.findByPid(pid);
    }


}
