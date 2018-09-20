package com.xx.idoctorall.controller;

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
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
@CrossOrigin
@Api(description = "登录注册", value = "登录注册")
public class LoginController {

    @Autowired
    private MongoServiceImpl mongoService;

    @PostMapping("/doLogin")
    @ApiOperation(value = "登录")
    public JSONResult doLogin(User user, HttpServletRequest request) {
        System.out.println(user.getUsername()+" : "+user.getPassword());
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), String.valueOf(new Md5Hash(user.getPassword(),user.getUsername())));

        try {
            //自动登录
            token.setRememberMe(user.isRememberMe());
            subject.login(token);

        } catch (AuthenticationException e) {
            return JSONResult.errorMsg(e.getMessage());
        }

       /* //创建session对象
        HttpSession session = request.getSession();
        if (session==null) {
            //把用户数据保存在session域对象中
            session.setAttribute("loginName", user.getUsername());*/
            if (subject.hasRole("1")) {
                return JSONResult.ok("patient");
            } else if (subject.hasRole("2")) {
                return JSONResult.ok("doctor");
            } else return JSONResult.ok("admin");
        //}else return
    }

    @PostMapping("/doRegiste")
    @ApiOperation(value = "注册")
    public JSONResult registe(User user){

        return JSONResult.ok();
    }

    @GetMapping("/mongo")
    @ApiOperation(value = "Mongo测试")
    public JSONResult mongo(){
        return JSONResult.ok(mongoService.findAll());
    }
}
