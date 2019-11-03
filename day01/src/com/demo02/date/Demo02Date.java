package com.demo02.date;

import java.util.Date;

/*
    Date类的成员方法
 */
public class Demo02Date {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        void setTime(lang time)把毫秒值转换为日期
        此方法，相当于Date类的带参构造方法
        Date(lang date)
     */
    private static void show02() {
        Date date = new Date();
        System.out.println(date);//Sun Nov 03 11:07:48 CST 2019
        date.setTime(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
    }

    /*
        long getTime() 把日期转换为毫秒值
        1970年1月1日00:00:00到当前时间所经历的毫秒值
     */
    private static void show01() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1572750252448 毫秒值
    }
}
