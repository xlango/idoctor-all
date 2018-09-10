package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.Customer;

import java.util.List;

public interface MongoService {
    Customer findByFirstName(String firstName);
    List<Customer > findByLastName(String lastName);
    List<Customer> findAll();
}
