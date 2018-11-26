package com.xx.idoctorall.dao.api;


import com.xx.idoctorall.entity.relation.Keshi;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KeshiRepository extends CrudRepository<Keshi,Integer> {

    List<Keshi> findAll();
    Keshi save(Keshi keshi);
}
