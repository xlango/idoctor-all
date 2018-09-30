package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.entity.DiagnosisResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisResultRepository extends MongoRepository<DiagnosisResult,Long> {

    DiagnosisResult save(DiagnosisResult diagnosisResult);
}
