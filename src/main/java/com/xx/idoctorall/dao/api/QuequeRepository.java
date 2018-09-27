package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Queque;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuequeRepository extends MongoRepository<Queque,Long>{
    Queque save(Queque queque);

    Queque deleteByDid(Long did);
}
