package com.xx.idoctorall.dao.custom.impl;

import com.xx.idoctorall.dao.custom.DetectionCustomDao;
import com.xx.idoctorall.entity.nonrelation.Detection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DetectionCustomDaoImpl implements DetectionCustomDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateStatus(String  id,String item, Integer status) {
        Query query = new Query(new Criteria().andOperator(Criteria.where("_id").is(id)
                ,Criteria.where("maps").elemMatch(Criteria.where(item).is(-status))));
        Map<String,Integer> map=new HashMap<>();
        map.put(item,status);
        Update update = new Update();
        update.set("maps.$",map);
        mongoTemplate.updateFirst(query,update, Detection.class);
    }
}
