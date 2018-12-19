package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.DiaryRepository;
import com.xx.idoctorall.entity.relation.Diary;
import com.xx.idoctorall.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryRepository diaryRepository;
    @Override
    public Diary save(Diary diary) {
        return diaryRepository.save(diary);
    }

    @Override
    public List<Diary> findByUseridAndCreateTime(int userid,String  time) {
            return diaryRepository.findByUseridAndCreateTime(userid,time);
    }
}
