package com.xx.idoctorall.dao.custom;

import com.xx.idoctorall.entity.nonrelation.Prescription;

public interface PrescriptionCustomDao {

    Prescription findNew(Long pid);
}
