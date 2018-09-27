package com.xx.idoctorall.dao.custom;

import com.xx.idoctorall.entity.nonrelation.Queque;

public interface QuequeCustomDao {

    void updateByPidandDid(Long pid, Long did, Queque queque);
}
