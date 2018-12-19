package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 病例
 */
@Data
@Entity(name = "pcase")
@ApiModel
public class Case {
    //病号，病症单号，检测单号，姓名、诊断结果、药单号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;        //病人id
    private int detectionid;//检查单id
    private int detectionresultid;//检查结果单id
    private int diagnosisid;//初诊情况id
    private int diagnosisresultid;//二诊结果id
    private int hospitalizationid;//住院信息id
    private int prescriptionid;  //药方id
    private Date time;       //病例生成时间
    private String filepath;//pdf文件路径

}
