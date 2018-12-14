package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.DoctorDetialRepository;
import com.xx.idoctorall.entity.relation.DoctorDetial;
import com.xx.idoctorall.service.DoctorDetialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorDetialServiceImpl implements DoctorDetialService {

    @Autowired
    private DoctorDetialRepository doctorDetialRepository;

    @Override
    public DoctorDetial findByDoctorId(int doctorid) {
        return doctorDetialRepository.findByDoctorId(doctorid);
    }

    @Override
    public List<DoctorDetial> findAllByHospital(DoctorDetial doctorDetial) {
        return doctorDetialRepository.findAllByHospital(doctorDetial);
    }
}
