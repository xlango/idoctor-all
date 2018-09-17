package com.xx.idoctorall.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * 检查列表
 */
@Data
@ApiModel
public class Detection {

    private Long id;
    private Long pid;//病人id
    private Long did;//就诊医生id
    private Data time;//检查单生成时间
    private List<String> detaillist;//检查项（检查项1、检查项2......）
}
