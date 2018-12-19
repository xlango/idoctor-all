package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.Diary;

import java.util.List;

public interface DiaryService {

    Diary save(Diary diary);

    List<Diary> findByUseridAndCreateTime(int userid, String time);
}
