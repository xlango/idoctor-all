package com.xx.idoctorall.entity.relation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "guahao")
@ApiModel
public class GuaHao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid; //病人id
    private String pname;//病人姓名
    private int did; //医生id
    private String dname;//医生姓名
    private Date time;//挂号时间
    private int status;//处理状态

}
