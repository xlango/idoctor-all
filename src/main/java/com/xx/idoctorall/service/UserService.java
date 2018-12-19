package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.User;

import java.util.List;

public interface UserService {

    String findAllByUsername(String username);

    User save(User user) ;

    User findByUsername(String userName);

    List<User> findByRoleid(int roleId);

    User findById(int id);

    int update(User user);

    int updatePwdById(User user);

    int updateRealnameStatus(User user);

    List<User> findByHospital(String hospital);

    List<User> findByPatient(int did);

    int updateRealname(User user);
}
