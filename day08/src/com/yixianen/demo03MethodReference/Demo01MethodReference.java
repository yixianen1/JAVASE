package com.yixianen.demo03MethodReference;

import java.util.function.Supplier;

/*
    类名--引用静态方法
 */
public class Demo01MethodReference {
    /*
        定义一个方法
            方法的参数传递Supplier接口,泛型使用Double
     */
    public static void getDouble(Supplier<Double> sup){
        //使用Supplier接口中的方法get获取一个随机的小数
        Double d = sup.get();
        System.out.println(d);
    }

    public static void main(String[] args) {
        //调用getDouble方法,参数Supplier是一个函数式接口,所以可以传递Lambda重写get方法
        getDouble(()->{
            //获取一个随机的小数
            return Math.random();//[0.0-1.0)
        });

        //简化Lambda
        getDouble(()->Math.random());

        /*
            方法引用:简化Lambda
            Math类是已经存在
            random静态方法也是存在的
            所以可以使用类名直接引用静态方法
                类名::静态方法
         */
        getDouble(Math::random);
    }
}
