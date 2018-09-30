package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.entity.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription,Long> {

    Prescription save(Prescription prescription);
}
