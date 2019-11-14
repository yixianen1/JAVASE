package com.yixianen.demo02set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素
        存储的自定义类型的元素(Person,Student...),必须重写hashCode和equals方法
        以保证同属性的元素视为同一个元素(姓名和年龄相同人视为同一个人)
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合,存储Person
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("小美女",18));
        set.add(new Person("小美女",18));
        set.add(new Person("重地",18));
        set.add(new Person("通话",18));
        set.add(new Person("大美女",20));
        //遍历Set集合
        for (Person p : set) {
            System.out.println(p);
        }
    }
}
