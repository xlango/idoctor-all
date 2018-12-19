package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.GuaHao;

import java.util.Date;
import java.util.List;


public interface GuahaoService {

    GuaHao findByDidAndPid(int did, int pid);

    GuaHao save(GuaHao guaHao);

    GuaHao findNew();

    List<GuaHao> findByDidAsc(int did);

    int deleteByPidAndDid(int pid,int did);

    int updateTimeByPid(Date time,int did, int pid);
}
