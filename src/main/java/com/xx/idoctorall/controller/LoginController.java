package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.custom.JSONResult;
import com.xx.idoctorall.entity.relation.User;
import com.xx.idoctorall.service.impl.MongoServiceImpl;
import com.xx.idoctorall.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
@CrossOrigin
@Api(description = "登录注册", value = "登录注册")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MongoServiceImpl mongoService;

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/doLogin")
    @ApiOperation(value = "登录")
    public JSONResult doLogin(User user, HttpServletRequest request) {
        System.out.println(user.getUsername()+" : "+user.getPassword());
        Subject subject= SecurityUtils.getSubject();
        String pwdMd5=String.valueOf(new Md5Hash(user.getPassword(),user.getUsername()));
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), pwdMd5);

        try {
            //自动登录
            token.setRememberMe(user.isRememberMe());
            subject.login(token);

        } catch (AuthenticationException e) {
            return JSONResult.errorMsg(e.getMessage());
        }

        //判断该账号是否已经登录
        String loginStatus = (String) request.getSession().getAttribute(user.getUsername());
        if (loginStatus!=null){
            return JSONResult.errorMsg("loginexist");
        }
        //登录成功保存session
        request.getSession().setAttribute(user.getUsername(),pwdMd5);
            if (subject.hasRole("1")) {
                return JSONResult.ok("patient");
            } else if (subject.hasRole("2")) {
                return JSONResult.ok("doctor");
            } else return JSONResult.ok("admin");
    }

    //登出，删除session
    @PostMapping("/logout")
    public JSONResult loginOut(HttpServletRequest request,String username) {
        System.out.println("用户："+username+"注销");
        request.getSession().removeAttribute(username);
        return JSONResult.ok();
    }

    @PostMapping("/doRegiste")
    @ApiOperation(value = "注册")
    public JSONResult registe(User user){
        logger.info(user.getUsername()+":"+user.getPassword()+":"+user.getRoleid());
        if (userService.findByUsername(user.getUsername())!=null){
            return JSONResult.errorMsg("exist");
        }else {
            user.setPassword(String.valueOf(new Md5Hash(user.getPassword(),user.getUsername())));
            userService.save(user);
            return JSONResult.ok("success");
        }

    }

    @GetMapping("/mongo")
    @ApiOperation(value = "Mongo测试")
    public JSONResult mongo(){
        return JSONResult.ok(mongoService.findAll());
    }
}
