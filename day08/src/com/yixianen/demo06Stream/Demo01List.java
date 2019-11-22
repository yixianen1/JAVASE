package com.yixianen.demo06Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用传统的方式,对集合中的元素进行过滤,遍历集合
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合中的元素进行过滤,只要以张开头元素,存储到一个新的集合中
        List<String> listZhang = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张")){
                listZhang.add(name);
            }
        }

        //对listZhang集合中的元素进行过滤,只要名字长度为3的元素,存储到一个新的集合中
        List<String> listThree = new ArrayList<>();
        for (String name : listZhang) {
            if(name.length()==3){
                listThree.add(name);
            }
        }

        //遍历listThree集合
        for (String name : listThree) {
            System.out.println(name);
        }
    }
}
