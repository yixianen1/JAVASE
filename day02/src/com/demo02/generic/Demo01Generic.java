package com.demo02.generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    使用泛型的好处:
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    /*
        创建集合对象,使用泛型
        好处:
            1.想使用元素特有的方法,避免了类型转换的麻烦
            2.把运行时异常,提升到编译时期
        弊端:
            只能存储对应泛型的数据
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //list.add(1);
        //使用增强for遍历list集合
        for(String s : list){
            System.out.println(s+"-->"+s.length());
        }
    }

    /*
        创建集合对象,不使用泛型
        好处:
            集合的类型默认为Object类型,可以存储任意的对象
        弊端:
            不安全,
            不能使用元素特有的方法
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()){
            //取出集合中元素,Object类型
            Object obj = it.next();
            System.out.println(obj);

            /*
                想使用字符串特有的方法length
                不能使用,需要向下转型
                Object obj = "abc";多态
             */
            String s = (String)obj;
            System.out.println(s.length());
        }

    }
}
