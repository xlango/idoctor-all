package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.nonrelation.Prescription;
import com.xx.idoctorall.service.PrescriptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/prescription")
@Api(description = "处方管理", value = "处方管理")
@CrossOrigin
public class PrescriptionController {

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:sss");

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping("/save")
    @ApiOperation(value = "添加处方")
    public Prescription save(Prescription prescription){
        //prescription.setTime(formatter.format(new Date()));
        Map<String, String> map=new HashMap<>();
        map.put("药剂1","2包");
        List<Map<String,String>> maps=new ArrayList<Map<String, String>>();
        maps.add(map);
       // prescription.setPrescriptionmap(maps);
        return prescriptionService.save(prescription);
    }

    @GetMapping("/findByUserifindByPidAndTimeLiked")
    public List<Prescription> findByPidAndTimeLike(int pid, String date){
        return prescriptionService.findByPidAndTimeLike(pid,date);
    }

    @GetMapping("/findNew")
    public Prescription findNew(int pid){
        return prescriptionService.findNew(pid);
    }

    @GetMapping("/findByPatient")
    public List<Prescription> findByPatient(int did){
        return prescriptionService.findByPatient(did);
    }
}
