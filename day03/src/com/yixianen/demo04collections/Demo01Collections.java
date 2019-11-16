package com.yixianen.demo04collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections:集合的工具类
        - public static void shuffle(List<?> list):打乱集合顺序。
        - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        - public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
    注意:以上方法,必须传递List集合,不能传递Set集合
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);//[1, 2, 3, 4]

        //使用Collections中的方法shuffle打乱集合中的元素的顺序
        Collections.shuffle(list);
        System.out.println(list);//[3, 2, 1, 4]  [2, 3, 1, 4]

        //使用Collections中的方法sort对集合中的元素进行默认排序(升序)
        Collections.sort(list);
        System.out.println(list);//[1, 2, 3, 4]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("1");
        list02.add("B");
        list02.add("cd");
        list02.add("cc");
        System.out.println(list02);//[a, 1, B, cd, cc]
        //使用Collections中的方法sort对集合中的元素进行默认排序(升序,编码表顺序)
        Collections.sort(list02);
        System.out.println(list02);//[1, B, a, cc, cd]
    }
}
