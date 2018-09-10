package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.MongoTestRepository;
import com.xx.idoctorall.entity.Customer;
import com.xx.idoctorall.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoTestRepository mongoTestRepository;

    @Override
    public Customer findByFirstName(String firstName) {
        return mongoTestRepository.findByFirstName(firstName);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return mongoTestRepository.findByLastName(lastName);
    }

    @Override
    public List<Customer> findAll() {
        return mongoTestRepository.findAll();
    }
}
