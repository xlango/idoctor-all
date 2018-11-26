package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Diagnosis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends MongoRepository<Diagnosis,Long> {

    Diagnosis save(Diagnosis diagnosis);
}
