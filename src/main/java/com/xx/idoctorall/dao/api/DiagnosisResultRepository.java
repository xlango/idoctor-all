package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.DiagnosisResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisResultRepository extends MongoRepository<DiagnosisResult,Long> {

    DiagnosisResult save(DiagnosisResult diagnosisResult);
}
