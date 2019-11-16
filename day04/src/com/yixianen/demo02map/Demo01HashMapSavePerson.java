package com.yixianen.demo02map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型
        HashMap集合如何保证key不重复
        作为key的元素必须重写hashCode和equals方法
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
        HashMap存储自定义类型
        key:Person
        value:String
        Person类需要重写hashCode和equals方法,以保证同名同年龄的是视为同一个人
     */
    private static void show02() {
        //创建HashMap集合,存储Person
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("习大大",18),"中国");
        map.put(new Person("女王",18),"英国");
        map.put(new Person("金三胖",6),"朝鲜");
        map.put(new Person("普京",28),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //遍历Map集合,使用entrySet+增强for
//        Set<Map.Entry<Person, String>> set = map.entrySet();
//        for (Map.Entry<Person, String> entry : set) {
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            //使用Entry对象中的方法getKey和getValue获取键与值
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    /*
        HashMap存储自定义类型
        key:String
        value:Person
        key是String,已经重写了hashCode和equals方法,可以保证key唯一
     */
    private static void show01() {
        //创建HashMap集合,存储Person
        HashMap<String,Person> map = new HashMap<>();
        map.put("中国",new Person("习大大",18));
        map.put("美国",new Person("奥巴马",80));
        map.put("朝鲜",new Person("金三胖",6));
        map.put("俄罗斯",new Person("普京",28));
        map.put("美国",new Person("特朗普",90));
        //遍历Map集合,使用keySet+增强for
        Set<String> set = map.keySet();
        for (String key : set) {
            //通过key获取value
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
