package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.entity.DetectionResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectionResultRepository extends MongoRepository<DetectionResult,Long> {

    DetectionResult save(DetectionResult dr);

    DetectionResult findByDetectionidAndDetectionname(Long detectionId,String detectionName);
}
