package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Detection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetectionRepository extends MongoRepository<Detection,Long> {

    Detection save(Detection detection);

    List<Detection> findByPidAndTimeLike(Long pid, String date);

    List<Detection> findByTimeLike(String date);
}
