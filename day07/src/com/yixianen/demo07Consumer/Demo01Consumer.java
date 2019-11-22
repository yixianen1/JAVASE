package com.yixianen.demo07Consumer;

import java.util.function.Consumer;

/*
    函数式接口:消费型接口
        java.util.function.Consumer<T>
        抽象方法:
            void accept(T t)，意为消费一个指定泛型的数据。
        作用:
            接口指定什么泛型,就可以使用accept方法消费什么类型的数据
            至于怎么消费,随意(写在Lambda中)
 */
public class Demo01Consumer {
    /*
        定义一个方法
            参数传递函数式接口Consumer,泛型使用String
            参数传递一个被消费的字符串
            方法内部使用Consumer接口中的方法accept消费传递的字符串
     */
    public static void printString(Consumer<String> con,String s){
        con.accept(s);
    }

    public static void main(String[] args) {
        //调用printString,参数Consumer是一个函数式接口,所以可以使用Lambda重写accept方法
        printString((String str)->{
            //直接输出字符串
            System.out.println(str);
        },"柳岩");


        printString(str->{
            //把字符串反向输出
            /*StringBuilder bu = new StringBuilder(str);
            bu.reverse();
            System.out.println(bu.toString());*/

            System.out.println(new StringBuilder(str).reverse().toString());
        },"柳岩");
    }
}
