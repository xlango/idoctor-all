package com.xx.diagnosisserver.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 检查结果
 */
@Data
@ApiModel
public class DetectionResult {

    //private Long _id;
    private Long pid;//病人id
    private Long did;//检查医生id
    private Long detectionid;//检查单id
    private String detectionname;//检查项名
    private String time;//检查时间
    private List<String> detaillist;
    private List<Map<String,String>> maps;//检查结果项（结果1、结果2......）
}
