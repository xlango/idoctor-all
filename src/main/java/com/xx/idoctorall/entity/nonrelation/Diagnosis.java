package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 就诊情况
 */
@Data
@Entity(name = "diagnosis")
@ApiModel
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人id
    private int did;//医生id
    private Date time;//就诊时间
    private String detaillist;//就诊详细情况扩展

}
