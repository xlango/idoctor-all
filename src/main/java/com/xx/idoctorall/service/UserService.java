package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.User;

import java.util.List;

public interface UserService {

    String findAllByUsername(String username);

    User save(User user) ;

    User findByUsername(String userName);

    List<User> findByRoleid(int roleId);
}
