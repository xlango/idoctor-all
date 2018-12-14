package com.xx.idoctorall.dao.custom.impl;


import com.xx.idoctorall.dao.custom.PrescriptionCustomDao;
import com.xx.idoctorall.entity.nonrelation.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PrescriptionCustomDaoImpl implements PrescriptionCustomDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Prescription findNew(Long pid) {
        Query query = new Query();
        query.with(new Sort(new Sort.Order(Sort.Direction.DESC,"time")));
       // mongoTemplate.find (new Query(Criteria.where("onumber").is("002")),Prescription)

        return null;
    }
}
