package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.GuaHao;

public interface GuahaoService {

    GuaHao findByDidAndPid(int did, int pid);

    GuaHao save(GuaHao guaHao);

    GuaHao findNew();
}
