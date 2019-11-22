package com.yixianen.demo09Predicate;

import java.util.function.Predicate;

/*
    函数式接口:
    java.util.function.Predicate接口:用于对数据进行判断
    抽象方法:
        boolean test(T t)对某种类型的数据进行判断，从而得到一个boolean值结果。
            满足条件,返回true
            不满足条件,返回false
            判断的规则使用Lambda重写
 */
public class Demo01Predicate {
    /*
        定义一个方法
            参数传递一个字符串
            参数传递Predicate接口,泛型使用String
     */
    public static void checkString(String s, Predicate<String> pre){
        //使用Predicate接口的方法test对字符串s进行判断
        boolean b = pre.test(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //调用checkString,参数Predicate是一个函数式接口,所以可以使用Lambda重写test方法
        checkString("123bc",(String s)->{
            //判断字符串中是否包含a
            return s.contains("a");
        });
    }
}
