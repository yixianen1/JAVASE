package com.demo06.generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象的时候作为泛型使用
        作为方法的参数的泛型使用
 */
public class Demo01Generic {
    public static void main(String[] args) {
        //不能创建对象的时候作为泛型使用
        //ArrayList<?> list = new ArrayList<>();
        //list.add(1);

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArrayList(list01);
        printArrayList(list02);
    }

    /*
        定义一个方法,对ArrayList集合进行遍历
        要求:可以遍历任意数据类型的ArrayList集合
     */
    public static void printArrayList(ArrayList<?> list){
        //使用迭代器遍历集合,迭代器的泛型和集合一样
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //取出元素是Object类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
