package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 病例
 */
@Data
@ApiModel
public class Case {
    //病号，病症单号，检测单号，姓名、诊断结果、药单号
    //private Long id;
    private Long pid;        //病人id
    private Long detectionid;//检查单id
    private Long detectionresultid;//检查结果单id
    private Long diagnosisid;//初诊情况id
    private Long diagnosisresultid;//二诊结果id
    private Long hospitalizationid;//住院信息id
    private Long prescriptionid;  //药方id
    private Data time;       //病例生成时间

}
