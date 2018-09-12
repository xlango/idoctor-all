package com.xx.idoctorall.dao;

import com.xx.idoctorall.BaseTests;
import com.xx.idoctorall.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

public class UserRepositoryTest extends BaseTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllByUsername() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        List<User> allByUsername = userRepository.findAllByUsername("111111");
        for (User user:allByUsername){
            System.out.println("用户：=============================="+user.getId());
        }
    }

    @Test
    public void findAll() {
        List<User> allByUsername = userRepository.findAll();
        for (User user:allByUsername){
            System.out.println("用户：=============================="+user.getId());
        }
    }

    @Test
    public void getRoleidByUsername() {
        User u=userRepository.getRoleidByUsername("111111");
            System.out.println("================"+u.getRoleid());
    }
}