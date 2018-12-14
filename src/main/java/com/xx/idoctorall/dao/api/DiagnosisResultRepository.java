package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.DiagnosisResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisResultRepository extends CrudRepository<DiagnosisResult,Integer> {

    DiagnosisResult save(DiagnosisResult diagnosisResult);
}
