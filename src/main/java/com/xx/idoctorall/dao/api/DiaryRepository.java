package com.xx.idoctorall.dao.api;


import com.xx.idoctorall.entity.relation.Diary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 日志
 */

public interface DiaryRepository  extends CrudRepository<Diary,Integer> {

    Diary save(Diary diary);

    @Query(value = "SELECT * FROM diary WHERE userid=?1 AND create_time LIKE CONCAT('%',?2,'%') ", nativeQuery = true)
    List<Diary> findByUseridAndCreateTime(int userid,String time);
}
