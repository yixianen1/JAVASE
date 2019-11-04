package com.demo05.System;

/*
    java.lang.System:系统类
        System类包含一些和系统相关的方法，是一个工具类，里面的方法都是静态的，可以通过类名直接调用
 */
public class Demo01System {
    public static void main(String[] args) {
//        学习目标：
//            能够使用System类获取当前毫秒时刻值
//            static long currentTimeMillis()返回一毫秒为单位的当前时间
//            此方法相当于Date类的getTime方法
//            1970年1月1日00:00:00到当前时间所经历的毫秒值
        long s = System.currentTimeMillis();
        System.out.println(s);//1572856976037
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序运行共耗时" + (e - s) + "毫秒");
    }
}
