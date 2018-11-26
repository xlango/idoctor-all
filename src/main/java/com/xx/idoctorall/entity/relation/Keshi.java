package com.xx.idoctorall.entity.relation;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "keshi")
public class Keshi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;//科室名

    //内科;消化内科;神经内科;肾内科;呼吸内科;血液内科;血液透析中心;心血管科;内分泌科;风湿免疫科;普外科;泌尿外科;心胸外科;疝诊疗中心;激光科;神经外科;妇产科;儿科;口腔科;眼科特需门诊;骨科;中医科;针灸科;传统医学科;精神心理科;肿瘤科;整形美容科;病理科;保健科;皮肤性病;放射科;美容中心;检验科;麻醉科;药材科;干部医疗科;超声波室;信息中心;理疗科;病案科;核医学科;耳鼻咽喉头颈外科;急诊科;眼科;眼科会诊中心;眼底病科;眼外伤科;青光眼科;白内障中心;眼角膜科;眼肌专业组;眼科整形专业;中医眼科;眼肿瘤;眼屈光科;营养科;口腔科;眼科特需门诊;耳鼻咽喉头颈外科;眼科;眼科会诊中心;眼底病科;眼外伤科;青光眼科;白内障中心;眼角膜科;眼肌专业组;眼科整形专业;眼肿瘤;眼屈光科;骨科;中医科;针灸科;传统医学科;中医眼科;精神心理科;肿瘤科;整形美容科;病理科;保健科;美容中心;检验科;药材科;干部医疗科;信息中心;病案科;急诊科;营养科;皮肤性病;放射科;超声波室;核医学科;麻醉科;理疗科;
}
