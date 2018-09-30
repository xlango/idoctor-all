package com.xx.idoctorall.dao.custom.impl;

import com.xx.idoctorall.dao.custom.QuequeCustomDao;
import com.xx.idoctorall.entity.nonrelation.Queque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class QuequeCustomDaoImpl implements QuequeCustomDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void updateByPidandDid(Long pid, Long did, Queque queque) {
        Query query = new Query(Criteria.where("pid").is(pid).and("did").is(did));
        Update update = new Update();
        update.set("status",queque.getStatus());
        update.set("time",sdf.format(new Date()));
        mongoTemplate.updateFirst(query,update,Queque.class);
    }
}
