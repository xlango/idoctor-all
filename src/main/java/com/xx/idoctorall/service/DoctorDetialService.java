package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.DoctorDetial;

public interface DoctorDetialService {

    DoctorDetial findByDoctorId(Long doctorid);
}
