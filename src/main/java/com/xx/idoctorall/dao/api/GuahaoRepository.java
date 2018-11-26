package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.GuaHao;
import org.springframework.data.repository.CrudRepository;

public interface GuahaoRepository extends CrudRepository<GuaHao,Long> {

    GuaHao findByDidAndPid(Long did,Long pid);

    GuaHao save(GuaHao guaHao);
}
