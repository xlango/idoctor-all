package com.xx.diagnosisserver.dao.custom;

/**
 * 自定义检查单接口操作病例
 */
public interface DetectionCustomDao {

    //修改检查状态 -1表示未完成  1表示完成
    void updateStatus(String id,String item,Integer status);
}
