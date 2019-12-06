package com.yixianen.demo01BufferedStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03Map {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();
        map.put("3","aaa");
        map.put("2","bbb");
        map.put("4","ccc");
        map.put("1","ddd");
        map.put("5","eee");
        //遍历Map集合
        Set<String> set = map.keySet();

        for (String key : set) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        /*
            1=ddd
            2=bbb
            3=aaa
            4=ccc
            5=eee
            HashMap集合是我一个无序的集合,会对key进行一个 自然排序(升序)
         */

    }
}
