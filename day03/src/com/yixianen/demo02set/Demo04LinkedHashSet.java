package com.yixianen.demo02set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
    java.util.LinkedHashSet<E>集合 extends HashSet<E>集合
    LinkedHashSet集合的特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法
         3.底层是一个哈希表+单向链表==>双向链表,是一个有序的集合
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("aaa");
        System.out.println(set);//不允许重复,无序的集合  [aaa, ccc, bbb]

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("aaa");
        System.out.println(linked);//不允许重复,有序的集合 [aaa, bbb, ccc]
    }
}
