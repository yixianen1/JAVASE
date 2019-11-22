package com.yixianen.demo06Supplier;

import java.util.function.Supplier;

/*
    函数式接口:生产型接口
        java.util.function.Supplier<T>用来生产数据
        抽象方法:
            T get()。用来获取一个泛型参数指定类型的对象数据。
        作用:
            接口的泛型使用什么类型,get方法就生产（返回）什么类型的数据
 */
public class Demo01Supplier {
    /*
        定义一个方法,方法的参数传递函数式接口Supplier,泛型使用String
     */
    public static String getString(Supplier<String> sup){
        //使用Supplier的方法get获取一个字符串返回
        String s = sup.get();
        return s;
    }

    public static void main(String[] args) {
        //调用getString方法,获取字符串,参数Supplier是一个函数式接口,所以可以使用Lambda重写get方法
        String name = getString(()->{
            return "小美女";
        });
        System.out.println(name);
    }
}
