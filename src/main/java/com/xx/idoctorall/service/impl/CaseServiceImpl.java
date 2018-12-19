package com.xx.idoctorall.service.impl;


import com.xx.idoctorall.dao.api.CaseRepository;
import com.xx.idoctorall.entity.nonrelation.Case;
import com.xx.idoctorall.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private CaseRepository caseRepository;

    @Override
    public Case save(Case c) {
        return caseRepository.save(c);
    }

    @Override
    public List<Case> findByPidAndTimeLike(int pid, String date) {
        return caseRepository.findByPidAndTimeLike(pid,date);
    }

    @Override
    public List<Case> findByPid(int pid) {
        return caseRepository.findByPid(pid);
    }

    @Override
    public List<Case> findAll() {
        return caseRepository.findAll();
    }

    @Override
    public Case findById(int id) {
        return caseRepository.findById(id);
    }
}
