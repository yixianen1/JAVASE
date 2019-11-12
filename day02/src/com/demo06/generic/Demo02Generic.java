package com.demo06.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
    泛型的上限与下限的限定:
        泛型上限限定: ? extends E 代表使用的泛型只要是E类型的子类/本身即可
	    泛型下限限定: ? super E   代表使用的泛型只要是E类型的父类/本身即可
 */
public class Demo02Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        /*
            类与类之间的继承关系:
                Ingteger extends Number extends Object
                String extends Object
         */

        getElement1(list1);
        //getElement1(list2);//报错  String和Number没有关系
        getElement1(list3);
        //getElement1(list4);//报错 传递的是Number的父类

        //getElement2(list1);//报错 传递的是Number的子类
        //getElement2(list2);//报错  String和Number没有关系
        getElement2(list3);
        getElement2(list4);

    }
    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}
