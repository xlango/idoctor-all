package com.xx.idoctorall.service.impl;


import com.xx.idoctorall.dao.PrescriptionDao;
import com.xx.idoctorall.entity.nonrelation.Prescription;
import com.xx.idoctorall.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionDao prescriptionDao;

    @Override
    public Prescription save(Prescription prescription) {
        return prescriptionDao.save(prescription);
    }

    @Override
    public List<Prescription> findByPidAndTimeLike(int pid, String date) {
        return prescriptionDao.findByPidAndTimeLike(pid,date);
    }

    @Override
    public Prescription findNew(int pid) {
        return prescriptionDao.findNew(pid);
    }
}
