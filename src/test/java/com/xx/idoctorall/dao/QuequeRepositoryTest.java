package com.xx.idoctorall.dao;

import com.xx.idoctorall.BaseTests;
import com.xx.idoctorall.dao.api.QuequeRepository;
import com.xx.idoctorall.entity.nonrelation.Queque;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuequeRepositoryTest extends BaseTests {

    @Autowired
    private QuequeRepository quequeRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private QuequeDao quequeDao;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void save() {
        Queque queque=new Queque();
        queque.setDid(2L);
        queque.setPid(2L);
        queque.setStatus(1);
        queque.setTime(sdf.format(new Date()));
        quequeDao.save(queque);
    }

    @Test
    public void update() {
        /*Query query = new Query(Criteria.where("pid").is(1L).and("status").is(1));
        Update update = Update.update("did",123L);
        Update update1=new Update();
        update1.set("pid",456L);
        update1.set("did",456L);
        update1.set("status",0);
        update1.set("time",new Date());
        mongoTemplate.updateFirst(query,update1,Queque.class);*/
        Queque queque=new Queque();
        queque.setStatus(0);
        quequeDao.updateByPidandDid(1L,1L,queque);
    }

    @Test
    public void deleteByDid() {

    }
}