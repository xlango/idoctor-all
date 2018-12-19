package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.nonrelation.Prescription;

import java.util.List;

public interface PrescriptionService {

    Prescription save(Prescription prescription);

    List<Prescription> findByPidAndTimeLike(int pid, String date);

    Prescription findNew(int pid);

    List<Prescription> findByPatient(int did);
}
