package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.DoctorDetial;
import org.springframework.data.repository.CrudRepository;

public interface DoctorDetialRepository extends CrudRepository<DoctorDetial,Long> {

    DoctorDetial findByDoctorId(Long doctorid);
}
