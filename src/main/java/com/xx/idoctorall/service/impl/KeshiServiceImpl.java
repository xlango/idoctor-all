package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.KeshiRepository;
import com.xx.idoctorall.entity.relation.Keshi;
import com.xx.idoctorall.service.KeshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeshiServiceImpl implements KeshiService {

    @Autowired
    private KeshiRepository keshiRepository;

    @Override
    public List<Keshi> findAll() {
        return keshiRepository.findAll();
    }

    @Override
    public Keshi save(Keshi keshi) {
        return keshiRepository.save(keshi);
    }
}
