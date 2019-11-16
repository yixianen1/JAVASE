package com.yixianen.demo01map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>接口:
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素由两个值组成(key,value)
        2.Map集合中key是不允许重复的,value可以重复
        3.Map集合中key的数据类型和value的数据类型可以相同,也可以不同
        4.Map集合中key和value是一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap底层使用的是哈希表结构
            jdk1.8之前:数组+单向链表
            jdk1.8之后:数组+单向链表/数组+红黑树
        2.是一个无序的集合,存储的元素和取出的元素顺序有可能不一致
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
        public boolean containKey(Object key):判断该集合中是否有此键。
        boolean containsValue(Object value)  判断该集合中是否有此值。
        包含:返回true; 不包含:返回false
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("d", 4);
        map.put("c", 3);
        boolean b1 = map.containsKey("d");
        System.out.println("b1:" + b1);//b1:true

        boolean b2 = map.containsKey("e");
        System.out.println("b2:" + b2);//b2:false

        System.out.println(map.containsValue(4));//true
        System.out.println(map.containsValue(5));//false
    }

    /*
        public V get(Object key)通过key获取value,key不存在,value返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("d", 4);
        map.put("c", 3);

        Integer v1 = map.get("a");
        System.out.println("v1:" + v1);//v1:1

        Integer v2 = map.get("q");
        System.out.println("v2:" + v2);//v2:null
    }

    /*
        public V remove(Object key) 根据指定的key,删除对应的键值对
            key存在,返回被删除的value
            key不存在,返回null
     */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("d", 4);
        map.put("c", 3);
        System.out.println(map);//{a=1, b=2, c=3, d=4}

        Integer v1 = map.remove("c");
        System.out.println("v1:" + v1);//v1:3

        Integer v2 = map.remove("w");
        System.out.println("v2:" + v2);//v2:null

        System.out.println(map);//{a=1, b=2, d=4}

    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            key不重复,v返回null
            可以重复,会使用新的value替换之前的value,返回被替换的value
     */
    private static void show01() {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();
        //使用put方法往Map集合中添加元素
        String v1 = map.put("杨过", "小龙女");
        System.out.println("v1:" + v1);//v1:null

        String v2 = map.put("郭靖", "黄蓉");
        System.out.println("v2:" + v2);//v2:null

        String v3 = map.put("尹志平", "小龙女");
        System.out.println("v3:" + v3);//v3:null

        String v4 = map.put("杨过", "大雕");
        System.out.println("v4:" + v4);//v4:小龙女

        System.out.println(map);//{杨过=大雕, 尹志平=小龙女, 郭靖=黄蓉}
    }

}
