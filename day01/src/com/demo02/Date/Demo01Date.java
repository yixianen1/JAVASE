package com.demo02.Date;

import java.util.Date;

/*
    java.util.Date类
        类Date表示特定的瞬间，精确到毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
        Date(lang date)带参构造方法
        作用：把毫秒值转换为日期
        参数：
            lang date:毫秒值
        注意：
            1.涉及到日期与时间相关的类里边使用的lang类型的参数都是毫秒值
            2.时间原点（起点）：0毫秒的时间
                英国，格林威治，1970年1月1日00:00:00
                中国，东八区，1970年1月1日08:00:00
      */
    private static void show02() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    /*
        Date()Date类的空参数构造方法
        作用：获取当前系统日期
        学习目标：
            能够使用日期类输出当前日期
        CST:中国标准时间
     */
    private static void show01() {
        Date date = new Date();
        System.out.println(date);
    }
}
