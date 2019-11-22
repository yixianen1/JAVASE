package com.yixianen.demo08Function;

import java.util.function.Function;

/*
    函数式接口:
    java.util.function.Function<T,R>接口:用于进行数据类型转换
    抽象方法:
        R apply(T t)，根据类型T的参数获取类型R的结果。
    作用:
        把T类的数据转换为R类返回
    例如:
        可以把String转换为Integer
        可以把Integer转换为String
        可以把Integer转换为Integer
        可以把String转换为Person
        ...
 */
public class Demo01Function {
    /*
        定义一个方法,方法的参数
            传递一个字符串类型的整数
            传递Function接口,泛型使用<String,Integer>
        方法内部,使用Fuction接口中的方法apply把字符串类型的整数,转换为Integer类型
     */
    public static void stringToIneteger(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in+100);
    }

    public static void main(String[] args) {
        //调用StringToIneteger方法,参数Function是一个函数式接口,所以可以使用Lambda表达式重写apply方法
        stringToIneteger("100",(String s)->{
            return Integer.parseInt(s);
        });
    }
}
