package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAllByUsername(String username);
    List<User> findAll();

    User getPasswordByUsername(String userName);

    User getRoleidByUsername(String userName);

    User save(User user) ;

    User findByUsername(String userName);
}
