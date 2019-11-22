package com.yixianen.demo08Function;

import java.util.function.Function;

/*
    需求:
        把字符串的姓名,转换为Person类型
 */
public class Demo02Function {
    /*
        定义一个方法
        参数传递字符串的姓名
        参数传递Function接口
     */
    public static void stringToPerson(String name, Function<String,Person> fun){
        Person p = fun.apply(name);
        System.out.println(p);
    }

    public static void main(String[] args) {
        //调用StringToIneteger方法,参数Function是一个函数式接口,所以可以使用Lambda表达式重写apply方法
        stringToPerson("老王",(String name)->{
            //根据姓名,创建Person对象返回
            return new Person(name);
        });
    }
}
