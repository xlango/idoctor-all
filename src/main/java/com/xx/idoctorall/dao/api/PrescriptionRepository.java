package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription,Long> {

    Prescription save(Prescription prescription);
}
