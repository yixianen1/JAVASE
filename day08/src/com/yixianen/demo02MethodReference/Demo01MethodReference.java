package com.yixianen.demo02MethodReference;

import java.util.function.Supplier;

/*
    对象名--引用成员方法
 */
public class Demo01MethodReference {
    /*
        定义一个方法
            方法的参数传递Supplier接口,泛型使用String
     */
    public static void getString(Supplier<String> sup){
        //使用Supplier接口的方法get,获取一个字符串
        String s = sup.get();
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "hello";//字符串对象,底层采用的是一个数组来存储多个字符串
        //调用getString方法,方法的参数Supplier是一个函数式接口,所以可以传递Lambda重写get方法
        getString(()->{
            //返回一个大写的字符串
            return str.toUpperCase();
        });

        //简化lambda
        getString(()->str.toUpperCase());

        /*
            方法引用:简化Lambda表达式
            字符串对象str是已经存储在的
            字符串中的方法toUpperCase也是已经存在
            所以我们就可以使用对象引用成员方法
                对象名::成员方法
         */
        getString(str::toUpperCase);
    }
}
