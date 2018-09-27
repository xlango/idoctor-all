package com.xx.idoctorall.dao;

import com.xx.idoctorall.BaseTests;
import com.xx.idoctorall.dao.api.UserRepository;
import com.xx.idoctorall.entity.relation.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Test
    public void save() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        user.setPhone("test");
        user.setRoleid(2);

        User save = userRepository.save(user);
        System.out.println(save.toString());
    }
}