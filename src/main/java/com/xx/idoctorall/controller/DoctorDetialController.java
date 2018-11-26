package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.relation.DoctorDetial;
import com.xx.idoctorall.service.impl.DoctorDetialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctordetial")
@CrossOrigin
public class DoctorDetialController {

    @Autowired
    private DoctorDetialServiceImpl doctorDetialService;

    @GetMapping("/findByDoctorId")
    public DoctorDetial findByDoctorId(Long doctorid) {
        return doctorDetialService.findByDoctorId(doctorid);
    }
}
