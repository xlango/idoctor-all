package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.DoctorDetial;

import java.util.List;

public interface DoctorDetialService {

    DoctorDetial findByDoctorId(int doctorid);

    List<DoctorDetial> findAllByHospital(DoctorDetial doctorDetial);
}
