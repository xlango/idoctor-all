package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * 诊断结果
 */
@Data
@ApiModel
public class DiagnosisResult {

    //private Long id;
    private Long pid;//病人id
    private Long did;//就诊医生id
    private Long diagnosisid;//诊断情况单id
    private String time;//诊断结果时间
    private List<String> detaillist;//诊断结果项（结果1、结果2......）
}
