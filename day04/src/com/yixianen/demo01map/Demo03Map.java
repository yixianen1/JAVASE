package com.yixianen.demo01map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map的遍历_通过键值对的方式
    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法entrySet,把所有的Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey和getValue获取键与值
 */
public class Demo03Map {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        map.put("赵丽颖",1.65);
        map.put("迪丽热巴",1.68);
        map.put("林志玲",1.78);
        //1.使用Map集合中的方法entrySet,把所有的Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Double>> set = map.entrySet();
        //2.遍历Set集合,获取每一个Entry对象
        //使用迭代器遍历Set集合
        Iterator<Map.Entry<String, Double>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Double> entry = it.next();
            //3.使用Entry对象中的方法getKey和getValue获取键与值
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("-----------------");
        //使用增强for遍历Set集合
        for (Map.Entry<String, Double> entry : set) {
            //3.使用Entry对象中的方法getKey和getValue获取键与值
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
