package com.yixianen.demo03map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<k,v>集合 implements Map<k,v>
    Hashtable是一个最早期的双列集合,在jdk1.0版本就存在了
    Hashtable底层也是一个哈希表

    Hashtable是一个线程安全的集合,是一个单线程的集合,效率低
    HashMap是一个线程不安全的集合,是一个多线程的集合,效率高
    Hashtable不允许存储null键null值,会抛出异常
    HashMap允许存储null键null值

    Hashtable效率低所以被HashMap个取代了,但是Hashtable的子类Properties集合依然活跃在历史的舞台
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");//map.put("null","a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a");//NullPointerException
        //table.put("b",null);//NullPointerException
        //table.put(null,null);//NullPointerException
    }
}
