package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 诊断结果
 */
@Data
@Entity(name = "diagnosisresult")
@ApiModel
public class DiagnosisResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人id
    private int did;//就诊医生id
    private int diagnosisid;//诊断情况单id
    private Date time;//诊断结果时间
    private String detaillist;//诊断结果项（结果1、结果2......）
}
