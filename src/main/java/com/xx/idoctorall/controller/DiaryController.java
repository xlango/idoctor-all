package com.xx.idoctorall.controller;

import com.xx.idoctorall.entity.relation.Diary;
import com.xx.idoctorall.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/diary")
@CrossOrigin
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @PostMapping("/save")
    public Diary save(Diary diary){
        diary.setCreateTime(new Date());
        return diaryService.save(diary);
    }

    @GetMapping("/findByUseridAndCreateTimeLike")
    public List<Diary> findByUseridAndCreateTime(String time , int userid){
            return diaryService.findByUseridAndCreateTime(userid,time);
    }
}
