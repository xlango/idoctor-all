package com.xx.idoctorall.dao;


import com.xx.idoctorall.dao.api.CaseRepository;
import com.xx.idoctorall.dao.custom.CaseCustomDao;

/**
 * 病例数据访问层接口
 */
public interface CaseDao extends CaseRepository, CaseCustomDao {

}
