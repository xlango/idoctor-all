package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.GuahaoRepository;
import com.xx.idoctorall.entity.relation.GuaHao;
import com.xx.idoctorall.service.GuahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuahaoServiceImpl implements GuahaoService {

    @Autowired
    private GuahaoRepository guahaoRepository;

    @Override
    public GuaHao findByDidAndPid(int did, int pid) {
        return guahaoRepository.findByDidAndPid(did,pid);
    }

    @Override
    public GuaHao save(GuaHao guaHao) {
        return guahaoRepository.save(guaHao);
    }

    @Override
    public GuaHao findNew() {
        return guahaoRepository.findNew();
    }
}
