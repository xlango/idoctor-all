package com.xx.idoctorall.dao;

import com.xx.idoctorall.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoTestRepository extends MongoRepository<Customer, String> {

    Customer  findByFirstName(String firstName);
    List<Customer > findByLastName(String lastName);
}
