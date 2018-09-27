package com.xx.idoctorall.entity.relation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "doctor_detial")
@ApiModel
public class DoctorDetial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long doctorId; //医生编号
    private String job; //职称
    private String hospital;//所属医院
    private String department;//科室
    private String worktime; //工作年限
    private String detial;  //详细描述

}
