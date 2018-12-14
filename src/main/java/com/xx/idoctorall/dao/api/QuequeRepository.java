package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Queque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuequeRepository extends CrudRepository<Queque,Integer> {
    Queque save(Queque queque);

    Queque deleteByDid(int did);
}
