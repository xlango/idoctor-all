package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.GuaHao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
public interface GuahaoRepository extends CrudRepository<GuaHao,Integer> {

    GuaHao findByDidAndPid(int did, int pid);

    GuaHao save(GuaHao guaHao);

    int deleteByPidAndDid(int pid,int did);

    @Modifying
    @Query(value = "update guahao set time=?1 where did=?2 and pid=?3", nativeQuery = true)
    int updateTimeByPid(Date time, int did,int pid);

    @Query(value = "select * from guahao ORDER BY time desc LIMIT 1", nativeQuery = true)
    GuaHao findNew();

    @Query(value = "SELECT * FROM guahao WHERE did=?1 ORDER BY time asc ", nativeQuery = true)
    List<GuaHao> findByDidAsc(int did);
}