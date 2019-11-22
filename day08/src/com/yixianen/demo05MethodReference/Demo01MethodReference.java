package com.yixianen.demo05MethodReference;

import java.util.Arrays;
import java.util.function.Function;

/*
    数组--构造引用
 */
public class Demo01MethodReference {
    /*
        创建一个方法
            参数传递int类型的数组长度
            传递Function接口,泛型使用<Integer,int[]>
     */
    public static void getArray(int n, Function<Integer, int[]> fun) {
        //使用Function接口中的方法apply,根据Ineteger类型的长度,转换为int[]
        int[] arr = fun.apply(n);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);//10
    }

    public static void main(String[] args) {
        //调用getArray方法,参数Function是一个函数式接口,所以可以传递Lambda重写apply方法
        getArray(10, (Integer i) -> {
            //根据数组的长度,创建数组对象并返回
            return new int[i];
        });

        //简化Lambda
        getArray(10, i -> new int[i]);

        /*
            方法引用:简化Lambda表达式
            数组的数类型是已经存在的int
            创建数组的动作就是new
            所以我们可以使用int[]引用new创建一个指定长度的数组
                数据类型[]::new
         */
        getArray(10, int[]::new);
    }
}
