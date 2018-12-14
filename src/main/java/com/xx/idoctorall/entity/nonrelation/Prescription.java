package com.xx.idoctorall.entity.nonrelation;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 药方
 */
@Data
@Entity(name = "prescription")
@ApiModel
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人id
    private int did;//就诊医生id
    private int diagnosisid;//诊断情况表id
    private Date time;//药房生成时间
    private String prescriptionmap;//药品及剂量

}
