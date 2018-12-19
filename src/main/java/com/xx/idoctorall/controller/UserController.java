package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.relation.User;
import com.xx.idoctorall.service.impl.UserServiceImpl;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findByUsername")
    public User findByUsername(String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/findByHospital")
    public List<User> findByHospital(String hospital){
        return userService.findByHospital(hospital);
    }

    @GetMapping("/findByPatient")
    public List<User> findByPatient(int did){
        return userService.findByPatient(did);
    }

    @GetMapping("/findById")
    public User findById(int id){
        return userService.findById(id);
    }

    @PostMapping("/save")
    public User save(User user){
        return userService.save(user);
    }

    @PostMapping("/updateRealname")
    public int updateRealname(User user){
        return userService.updateRealname(user);
    }

    @PostMapping("/updateRealnameStatus")
    public int updateRealnameStatus(User user){
        return userService.updateRealnameStatus(user);
    }

    @PostMapping("/update")
    public int update(User user){
        return userService.update(user);
    }

    @PostMapping("/updatePwdById")
    public int updatePwdById(String username,String pwd,String newpwd){
        User user=userService.findByUsername(username);
        pwd=String.valueOf(new Md5Hash(pwd,username));
        if (user.getPassword().equals(pwd)){
            user.setPassword(String.valueOf(new Md5Hash(newpwd,username)));
            return userService.updatePwdById(user);
        }else {
            return -1;
        }

    }
}
