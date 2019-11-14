package com.yixianen.demo02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set<E>接口 extends Collection<E>接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法
    java.util.HashSet<E>集合 implements Set<E>接口
    HashSet集合的特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法
         3.是一个无序的集合,存储元素和取出元素的顺序 有可能不一致
         4.底层是一个哈希表
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表 / 数组+红黑树(提高查询的速度)
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        Set<Integer> set = new HashSet<>();
        //往集合中添加元素
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        //使用增强for遍历Set集合
        for (Integer in : set) {
            System.out.println(in);// 1 2 3 4
        }
    }

    private static void show01() {
        Set<String> set = new HashSet<>();
        //往集合中添加元素
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("c");
        set.add("a");
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s); // a b c d 
        }
    }
}
