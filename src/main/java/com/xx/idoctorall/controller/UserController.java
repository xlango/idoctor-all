package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.relation.User;
import com.xx.idoctorall.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/findByRoleId")
    public List<User> findByRoleId(int roleId){
        return userService.findByRoleid(roleId);
    }
}
