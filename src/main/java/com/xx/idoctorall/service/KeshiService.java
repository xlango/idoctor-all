package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.Keshi;

import java.util.List;

public interface KeshiService {

    List<Keshi> findAll();
    Keshi save(Keshi keshi);
}
