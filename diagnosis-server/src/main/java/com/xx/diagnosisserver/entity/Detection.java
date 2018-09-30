package com.xx.diagnosisserver.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 检查列表
 */
@Data
@ApiModel
public class Detection {

    //private Long id;
    private Long pid;//病人id
    private Long did;//就诊医生id
    private String time;//检查单生成时间
    //private List<String> detaillist;
    private List<Map<String,Integer>> maps;//检查项（检查项-1、检查项-0......） 0和1表示检查状态

/*    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("qqqqq",11111);
        Set<String> strings = map.keySet();
        for (String key:strings) {
            System.out.println("===" + key + " : " + map.get(key));
        }

    }*/
}
