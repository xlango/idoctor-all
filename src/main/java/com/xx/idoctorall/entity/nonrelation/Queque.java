package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@ApiModel
@Document(collection = "queque")
public class Queque {

    /*@Id
    private Long id;*/
    private Long pid;//病人号
    private Long did;//医生编号
    private int status;//状态（1等待就诊、2等待检查、3检查结束进入二诊队列）
    private Date time; //加入队列时间，根据时间排序
}
