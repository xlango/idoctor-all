package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.entity.Case;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 使用API操作病例
 */
@Repository
public interface CaseRepository extends MongoRepository<Case,Long> {

    Case save(Case c);
    Case findByPidAndTime(Long pid, String date);

}
