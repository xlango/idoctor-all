package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * 检查结果
 */
@Data
@ApiModel
public class DetectionResult {

    //private Long id;
    private Long pid;//病人id
    private Long did;//检查医生id
    private Long detectionid;//检查单id
    private String detectionname;//检查项名
    private String time;//检查时间
    private List<String> detaillist;//检查结果项（结果1、结果2......）
}
