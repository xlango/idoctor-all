package com.xx.diagnosisserver.dao;

import com.xx.diagnosisserver.dao.api.CaseRepository;
import com.xx.diagnosisserver.dao.custom.CaseCustomDao;

/**
 * 病例数据访问层接口
 */
public interface CaseDao extends CaseRepository, CaseCustomDao {

}
