package com.yixianen.demo02set;

import java.util.HashSet;

/*
    使用HashSet集合存储元素不重复的原理:
        被存储的元素(String,Integer...)重写了hashCode和equals方法,以保证元素唯一
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
