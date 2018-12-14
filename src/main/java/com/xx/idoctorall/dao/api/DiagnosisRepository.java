package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Diagnosis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends CrudRepository<Diagnosis,Integer> {

    Diagnosis save(Diagnosis diagnosis);

    Diagnosis findById(int id);
}
