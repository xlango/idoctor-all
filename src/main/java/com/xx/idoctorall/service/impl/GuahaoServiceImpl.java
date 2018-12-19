package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.GuahaoRepository;
import com.xx.idoctorall.entity.relation.GuaHao;
import com.xx.idoctorall.service.GuahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public List<GuaHao> findByDidAsc(int did) {
        return guahaoRepository.findByDidAsc(did);
    }

    @Override
    public int deleteByPidAndDid(int pid,int did) {
        return guahaoRepository.deleteByPidAndDid(pid,did);
    }

    @Override
    public int updateTimeByPid(Date time,int did, int pid) {
        return guahaoRepository.updateTimeByPid(time,did,pid);
    }
}
