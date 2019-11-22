package com.yixianen.demo06Stream;

import java.util.ArrayList;
import java.util.List;

/*
    Stream:就是一个流式思想
        我们可以把集合/数组,转换为一个Stream流,使用Stream流中的方法,来操作集合/数组
    Stream可以使用代码更加优雅
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合中的元素进行过滤,只要以张开头元素,存储到一个新的集合中
        //对listZhang集合中的元素进行过滤,只要名字长度为3的元素,存储到一个新的集合中
        //遍历listThree集合
        //把list转换为Stream流
        /*list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));*/

        list.stream()//把list转换为Stream流
                .filter(name->name.startsWith("张"))//过滤以张开头的元素
                .filter(name->name.length()==3)//过滤长度为3的元素
                .forEach(System.out::println);//遍历Stream流
    }
}
