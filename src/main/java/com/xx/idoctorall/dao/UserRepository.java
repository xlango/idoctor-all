package com.xx.idoctorall.dao;

import com.xx.idoctorall.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAllByUsername(String username);
    List<User> findAll();

    User getPasswordByUsername(String userName);

    User getRoleidByUsername(String userName);

    User save(User user) ;


}
