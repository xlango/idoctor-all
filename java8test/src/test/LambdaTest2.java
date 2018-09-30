package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaTest2 {

    public static void main(String[] args) {
        new Action(){

            @Override
            public void execute(String content) {
                System.out.println(content);
            }
        }.execute("内部类实现");

        Action login=(String content)->{
            System.out.println(content);
        };
        login.execute("lambda实现");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a1");
        strings.add("a2");
        strings.add("a3");
        strings.forEach(
                s-> System.out.println(s)
        );

        ArrayList<Map<Integer,Integer>> maps=new ArrayList<>();
        for (int i=0;i<3;i++){
            Map<Integer,Integer> map=new HashMap<>();
            map.put(i,i);
            maps.add(map);
        }

        maps.stream().filter(
                m->m!=null
        ).forEach(
                s-> System.out.println(s.keySet())
        );

    }

    static interface Action{
        void execute(String content);
    }
}
