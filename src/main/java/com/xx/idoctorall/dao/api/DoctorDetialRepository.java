package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.DoctorDetial;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorDetialRepository extends CrudRepository<DoctorDetial,Integer> {

    DoctorDetial findByDoctorId(int doctorid);

    List<DoctorDetial> findAllByHospital(DoctorDetial doctorDetial);
}
