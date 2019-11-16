package com.yixianen.demo01map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
    Map集合的遍历_通过键找值的方式
    Map集合中的方法:
        Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet,把所有的key取出来存储到一个Set集合中
        2.遍历Set集合,获取Map集合的每一个key
        3.使用Map集合中的方法get(key),通过key找到value
 */
public class Demo02Map {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("赵丽颖", 1.65);
        map.put("迪丽热巴", 1.68);
        map.put("林志玲", 1.78);
        //1.使用Map集合中的方法keySet,把所有的key取出来存储到一个Set集合中
        Set<String> set = map.keySet();
        //2.遍历Set集合,获取Map集合的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //3.使用Map集合中的方法get(key),通过key找到value
            Double value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------");
        //使用增强for遍历Set集合
        for (String key : set) {
            //3.使用Map集合中的方法get(key),通过key找到value
            Double value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------");
        for (String key : map.keySet()) {
            Double value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
