package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.DetectionResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectionResultRepository extends CrudRepository<DetectionResult,Integer> {

    DetectionResult save(DetectionResult dr);

    DetectionResult findByDetectionidAndDetectionname(int detectionId, String detectionName);
}
