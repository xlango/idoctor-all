package com.xx.diagnosisserver.entity;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 药方
 */
@Data
@ApiModel
public class Prescription {

    private Long id;
    private Long pid;//病人id
    private Long did;//就诊医生id
    private Long diagnosisid;//诊断情况表id
    private String time;//药房生成时间
    private List<Map<String,String>> prescriptionmap;//药品及剂量

}
