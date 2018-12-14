package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.relation.DoctorDetial;
import com.xx.idoctorall.service.impl.DoctorDetialServiceImpl;
import com.xx.idoctorall.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctordetial")
@CrossOrigin
public class DoctorDetialController {

    @Autowired
    private DoctorDetialServiceImpl doctorDetialService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/findByDoctorId")
    public DoctorDetial findByDoctorId(int doctorid) {
        return doctorDetialService.findByDoctorId(doctorid);
    }

    @GetMapping("/findDoctorDetialByHospital")
    public List<DoctorDetial> findDoctorDetialByHospital(DoctorDetial doctorDetial) {
        return doctorDetialService.findAllByHospital(doctorDetial);
    }
}
