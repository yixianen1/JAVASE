package com.yixianen.demo06Supplier;

import java.util.function.Supplier;

/*
    需求:
        求数组元素最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
        提示：接口的泛型请使用java.lang.Integer类。
 */
public class Demo02Test {
    /*
        定义一个方法,方法的参数传递Supplier接口,泛型使用Integer
     */
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个数组,并赋值
        int[] arr = {1,0,50,-100,88,77};

        //调用getMax方法,参数Supplier是一个函数式接口,所以可以传递Lambda表达式重写get方法
        int max = getMax(()->{
            //获取数组的最大值
            //定义一个遍历,记录数组的最大值,把数组的第一个元素赋值给最大值
            int m = arr[0];
            //遍历数组,获取数组中的其他元素
            for (int i = 1; i < arr.length; i++) {
                //比较最大值和获取到的元素
                if(arr[i]>m){
                    //使用数组的元素替换最大值
                    m = arr[i];
                }
            }
            //返回最大值
            return m;
        });

        System.out.println(max);
    }
}
