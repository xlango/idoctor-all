package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 检查结果
 */
@Data
@Entity(name = "detectionresult")
@ApiModel
public class DetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人id
    private int did;//检查医生id
    private int detectionid;//检查单id
    private String detectionname;//检查项名
    private Date time;//检查时间
    private String detaillist;//检查结果项（结果1、结果2......）
}
