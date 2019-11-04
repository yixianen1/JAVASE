package com.demo06.StringBuilder;

/*
    StringBuilder的构造方法:
        public StringBuilder append(任意类型参数) ：添加任意类型数据的字符串形式，并返回当前对象自身
        底层源码：
             public StringBuilder append(String str) {
                super.append(str);
                return this;
            }
        返回值返回的是this，哪个对象调用的方法，方法中的this就是哪个对象
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加参数
//        StringBuilder bu2 = bu1.append("abc");
//        System.out.println(bu1);//abc
//        System.out.println(bu2);//abc
//        System.out.println(bu1 == bu2);//true 比较的是地址值
        /*bu1.append("abc");
        bu1.append(100);
        bu1.append(true);
        bu1.append(8.8);
        bu1.append('&');*/
        /*
            链式编程
                根据方法的返回值，可以继续调用方法
         */
//        bu1.append("abc").append(100).append(true).append(8.8);
        /*
            使用StringBuilder类可以解决的问题:
                提高字符串的效率,在内存中始终操作的是一个数组(一个字符串)
                占用内存小,效率高
            学习目标：
                能够使用StringBuilder进行字符串拼接操作
                "a" + "b" + "c"
         */
        bu1.append("a").append("b").append("c");
        System.out.println(bu1);//abc100true8.8&
    }
}
