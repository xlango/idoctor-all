package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.config.CacheExpire;
import com.xx.idoctorall.dao.api.UserRepository;
import com.xx.idoctorall.entity.relation.User;
import com.xx.idoctorall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Cacheable(value="users", key="#username")
    @CacheExpire(expire = 60)
    @Override
    public String findAllByUsername(String username) {
        return userRepository.findAllByUsername(username).get(0).getUsername();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public List<User> findByRoleid(int roleId) {
        return userRepository.findByRoleid(roleId);
    }
}
