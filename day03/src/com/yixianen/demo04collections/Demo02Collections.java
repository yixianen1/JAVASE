package com.yixianen.demo04collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> void sort(List<T> list，Comparator<? super T> ):根据指定比较器产生的顺序对指定列表进行排序。
    参数:
        java.util.Comparator<T>:是一个比较器接口
        有一个用于定义排序规则的抽象方法
            int compare(T o1, T o2) 比较用来排序的两个参数。
        排序的规则:
            升序:o1-o2
            降序:o2-01
 */
public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        System.out.println(list);//[2, 1, 4, 3]

        //使用Collections中的方法sort,传递比较器对集合中的元素进行升序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);//[1, 2, 3, 4]

        //使用Collections中的方法sort,传递比较器对集合中的元素进行降序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);//[4, 3, 2, 1]
    }
}
