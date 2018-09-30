package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.BaseTests;
import com.xx.diagnosisserver.dao.DetectionDao;
import com.xx.diagnosisserver.entity.Detection;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

public class DetectionRepositoryTest extends BaseTests {

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private DetectionDao detectionDao;

    @Test
    public void save() {
        List<String> list=new ArrayList<>();
        list.add("血液-0");
       /* list.add("尿液-0");
        list.add("CT-0");
        list.add("B超-0");*/

        List<Map<String,Integer>> maps=new ArrayList<>();
        for (int i=0;i<=3;i++){
            Map<String,Integer> map=new HashMap<>();
            map.put("测试key"+i,0);
            maps.add(map);
        }

        Detection detection=new Detection();
        detection.setDid(2L);
        detection.setPid(2L);
        //detection.setDetaillist(list);
        detection.setMaps(maps);
        detection.setTime(sdf.format(new Date()));
        detectionDao.save(detection);
    }

    @Test
    public void findByPidAndTimeLike() {
        List<Detection> detections = detectionDao.findByPidAndTimeLike(2L, "2018-09-27");
        for (Detection detection:detections){
            List<Map<String, Integer>> maps = detection.getMaps();
            for (Map<String, Integer> map:maps){
                Set<String> keys = map.keySet();
                for (String key:keys){
                    System.out.println("==="+key+" : "+map.get(key));
                }
            }
        }
    }

    @Test
    public void findByTimeLike() {

        List<Detection> detections = detectionDao.findByTimeLike("2018-09-27");
        for (Detection detection:detections){
            System.out.println("==="+detection.getTime());
        }
    }

    @Test
    public void updateStatus() {
        detectionDao.updateStatus("5baca1abc6abea2638b4a9fe","测试key1",-1);
    }
}