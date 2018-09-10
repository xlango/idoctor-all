package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.Customer;
import com.xx.idoctorall.entity.JSONResult;
import com.xx.idoctorall.entity.User;
import com.xx.idoctorall.service.impl.MongoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.provider.MD5;

@RestController
@RequestMapping("/login")
@Api(tags = "1.1", description = "登录", value = "登录")
public class LoginController {

    @Autowired
    private MongoServiceImpl mongoService;

    @PostMapping("/doLogin")
    @ApiOperation(value = "登录")
    public JSONResult doLogin(User user) {
        System.out.println(user.getUsername()+" : "+user.getPassword());
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());

        try {
            //自动登录
            token.setRememberMe(user.isRememberMe());
            subject.login(token);
        } catch (AuthenticationException e) {
            return JSONResult.errorMsg(e.getMessage());
        }

        if (subject.hasRole("1")){
            return JSONResult.ok("patient");
        }else if (subject.hasRole("2")){
            return JSONResult.ok("doctor");
        }else return JSONResult.ok("admin");
    }

    @GetMapping("/mongo")
    @ApiOperation(value = "Mongo测试")
    public JSONResult mongo(){
        return JSONResult.ok(mongoService.findAll());
    }
}
