package com.xx.idoctorall.dao.custom.impl;

import com.xx.idoctorall.dao.custom.QuequeCustomDao;
import com.xx.idoctorall.entity.nonrelation.Queque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class QuequeDaoImpl implements QuequeCustomDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateByPidandDid(Long pid, Long did, Queque queque) {
        Query query = new Query(Criteria.where("pid").is(pid).and("did").is(did));
        Update update = new Update();
        update.set("status",queque.getStatus());
        update.set("time",new Date());
        mongoTemplate.updateFirst(query,update,Queque.class);
    }
}
