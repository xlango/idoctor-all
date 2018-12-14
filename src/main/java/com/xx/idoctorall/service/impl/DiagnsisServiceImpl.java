package com.xx.idoctorall.service.impl;


import com.xx.idoctorall.dao.api.DiagnosisRepository;
import com.xx.idoctorall.entity.nonrelation.Diagnosis;
import com.xx.idoctorall.service.DiagnsisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnsisServiceImpl implements DiagnsisService {

    @Autowired
    private DiagnosisRepository diagnosisRepository;
    @Override
    public Diagnosis findById(Diagnosis diagnosis) {
        return diagnosisRepository.findById(diagnosis.getId());
    }
}
