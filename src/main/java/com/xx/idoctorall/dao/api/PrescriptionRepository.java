package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.nonrelation.Prescription;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription,Integer> {

    Prescription save(Prescription prescription);

    List<Prescription> findByPidAndTimeLike(int pid, String date);

    @Query(value = "select * from prescription where pid =?1 ORDER BY time desc LIMIT 1", nativeQuery = true)
    Prescription findNew(int pid);

}
