package com.demo04.Calendar;

import java.util.Calendar;

/*
    java.util.Calendar:日历类
        作用：
            1.可以通过Calendar类中的方法获取对应的日历字段（年月日...）
            2.可以通过Calendar类中的方法修改对应的日历字段
            3.可以通过Calendar类中的方法对日历字段进行增加或者减少

        Calendar 类是一个抽象类，无法直接创建对象
        Calendar 类提供了一个静态方法getInstance，这个方法返回的就是Calendar类的子类对象
            static Calendar getInstance()
            源码：
                Calendar cal = null;
                cal = new GregorianCalendar(zone, aLocale);多态
            注意：
                西方：0-11月 周日-周六
                东方：1-12月 周一-周日



 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);//不是地址就说明重写了toString方法

    }
}
