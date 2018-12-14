package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Detection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetectionRepository extends CrudRepository<Detection,Integer> {

    Detection save(Detection detection);

    List<Detection> findByPidAndTimeLike(int pid, String date);

    List<Detection> findByTimeLike(String date);
}
