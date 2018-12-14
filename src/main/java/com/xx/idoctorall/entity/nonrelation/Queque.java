package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "queque")
@ApiModel
public class Queque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人号
    private int did;//医生编号
    private int status;//状态（1等待就诊、2等待检查、3检查结束进入二诊队列）
    private Date time; //加入队列时间，根据时间排序
}
