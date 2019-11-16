package com.yixianen.demo03map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap特点
        LinkedHashMap底层是哈希表+单向链表-->双向链表
        LinkedHashMap里边存储的元素是有序的
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("aaa","111");
        map.put("ccc","222");
        map.put("ddd","333");
        map.put("bbb","444");
        map.put("aaa","555");
        System.out.println(map);//key不允许重复,value可以重复;是一个无序的集合 {aaa=555, ccc=222, bbb=444, ddd=333}

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("aaa","111");
        linked.put("ccc","222");
        linked.put("ddd","333");
        linked.put("bbb","444");
        linked.put("aaa","555");
        System.out.println(linked);//key不允许重复,value可以重复;是一个有序的集合 {aaa=555, ccc=222, ddd=333, bbb=444}

    }
}
