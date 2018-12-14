package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Case;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 使用API操作病例
 */
@Repository
public interface CaseRepository extends CrudRepository<Case,Integer> {

    Case save(Case c);
    List<Case> findByPidAndTimeLike(int pid, String date);
    List<Case> findByPid(int pid);
    List<Case> findAll();
    Case findById(int id);

}
