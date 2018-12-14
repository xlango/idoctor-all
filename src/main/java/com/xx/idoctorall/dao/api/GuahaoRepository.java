package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.GuaHao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface GuahaoRepository extends CrudRepository<GuaHao,Integer> {

    GuaHao findByDidAndPid(int did, int pid);

    GuaHao save(GuaHao guaHao);

    @Query(value = "select * from guahao ORDER BY time desc LIMIT 1", nativeQuery = true)
    GuaHao findNew();
}