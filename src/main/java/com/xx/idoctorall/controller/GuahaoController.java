package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.GuaHao;
import com.xx.idoctorall.entity.relation.User;
import com.xx.idoctorall.service.GuahaoService;
import com.xx.idoctorall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/guahao")
@CrossOrigin
public class GuahaoController {

    @Autowired
    private GuahaoService guahaoService;

    @Autowired
    private UserService userService;

    @GetMapping("/findNew")
    public GuaHao findNew(){
        return guahaoService.findNew();
    }

    @PostMapping("/save")
    public GuaHao save(GuaHao guaHao){
        if (guahaoService.findByDidAndPid(guaHao.getDid(),guaHao.getPid())!=null){
            guahaoService.updateTimeByPid(new Date(),guaHao.getDid(),guaHao.getPid());
            return null;
        }
        User p=userService.findById(guaHao.getPid());
        guaHao.setPname(p.getName());
        User d=userService.findById(guaHao.getDid());
        guaHao.setDname(d.getName());
        guaHao.setTime(new Date());
        return guahaoService.save(guaHao);
    }

    @GetMapping("/findByDidAsc")
    public List<GuaHao> findByDidAsc(int did){
        return guahaoService.findByDidAsc(did);
    }

    @GetMapping("/deleteByPid")
    public int deleteByPid(int pid,int did){
        return guahaoService.deleteByPidAndDid(pid,did);
    }


}
