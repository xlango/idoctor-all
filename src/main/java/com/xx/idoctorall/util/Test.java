package com.xx.idoctorall.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Test {
    String a;
    Set s;
    List l;
    Map m;
    List<String> la = new ArrayList<String>();

    @Async("messageExecutor")
    public  void loadPic() {
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("1st");
        h.add("2nd");
        h.add(new Integer(3));
        h.add(new Double(4.0));
        h.add("2nd");            //重复元素，未被添加
        h.add(new Integer(3));      //重复元素，未被添加
        h.add(new Date());
        h.add("32");
        System.out.println("开始：size="+h.size());
        Iterator it=h.iterator();
        while(it.hasNext())
        {
            Object o=it.next();
            System.out.println(o);
        }

        h.remove("2nd");
        System.out.println("移除元素后：size="+h.size());
        System.out.println(h);
        /*TreeSet ts=new TreeSet();
        ts.add("orange");
        ts.add("apple");
        ts.add("banana");
        ts.add("grape");
        Iterator it=ts.iterator();
        while(it.hasNext())
        {
            String fruit=(String)it.next();
            System.out.println(fruit);
        }*/
    }
}
