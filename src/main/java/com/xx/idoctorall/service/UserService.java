package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.User;

public interface UserService {

    String findAllByUsername(String username);

    User save(User user) ;

    User findByUsername(String userName);
}
