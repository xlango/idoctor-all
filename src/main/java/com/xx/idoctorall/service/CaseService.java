package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.nonrelation.Case;

import java.util.List;

public interface CaseService {

    Case save(Case c);
    List<Case> findByPidAndTimeLike(int pid, String date);
    List<Case> findByPid(int pid);
    List<Case> findAll();
    Case findById(int id);
}
