package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.BaseTests;
import com.xx.diagnosisserver.dao.DetectionResultDao;
import com.xx.diagnosisserver.entity.DetectionResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

public class DetectionResultRepositoryTest extends BaseTests {

    @Autowired
    private DetectionResultDao detectionResultDao;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void save() {
        DetectionResult detectionResult=new DetectionResult();
        detectionResult.setPid(1L);
        detectionResult.setDid(1L);
        detectionResult.setDetectionid(1L);
        detectionResult.setDetectionname("血液检查");
        detectionResult.setTime(sdf.format(new Date()));
        List<Map<String,String>> maps=new ArrayList<>();
        for (int i=0;i<=2;i++){
            Map<String,String> map=new HashMap<>();
            map.put("test"+i,i+"单位");
            maps.add(map);
        }
        detectionResult.setMaps(maps);
        detectionResultDao.save(detectionResult);
    }

    @Test
    public void findByDetectionidAndDetectionname() {
        DetectionResult dr = detectionResultDao.findByDetectionidAndDetectionname(1L, "血液检查");
        System.out.println("==="+dr.getTime());
    }
}