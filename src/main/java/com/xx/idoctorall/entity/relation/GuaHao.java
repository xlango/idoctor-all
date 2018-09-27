package com.xx.idoctorall.entity.relation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity(name = "guahao")
@ApiModel
public class GuaHao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pid; //病人id
    private Long did; //医生id
    private Date time;//挂号时间

    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        GuaHao guaHao=new GuaHao();
        guaHao.setId(1L);
        guaHao.setPid(1L);
        guaHao.setDid(1L);
        guaHao.setTime(new Date());


        System.out.println(df.format(guaHao.getTime()));

    }
}
