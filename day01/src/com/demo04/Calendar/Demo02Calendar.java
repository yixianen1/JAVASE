package com.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar类的成员方法：
        public int get(int field) ：返回给定日历字段的值。
        public void set(int field, int value) ：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount) ：根据日历的规则，为给定的日历字段添加或减去指
        定的时间量。
        public Date getTime() ：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    注意：
        参数：int field：
            指的是字段，Calendar类中指定的字段
            public final static int YEAR = 1;
            public final static int MONTH = 2;
            public final static int DAY_OF_MONTH = 5;
            public final static int DATE = 5;

            public final static int HOUR = 10;
            public final static int MINUTE = 12;
            public final static int SECOND = 13;

 */
public class Demo02Calendar {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
//        show04();
        show05();
    }

    /*
        void setTime()把日期转化为日历
     */
    private static void show05() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        c.setTime(new Date(0L));

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
        public Date getTime() ：把日历转化为Date日期
     */
    private static void show04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
        public abstract void add(int field, int amount) ：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        将日历字段增加/减少指定的值
        参数：
            int amount：整数
                正数：增加
                负数：减少

     */
    private static void show03() {
        //获取calendar的子类对象
        Calendar c = Calendar.getInstance();
        //把2019年增加十年
        c.add(Calendar.YEAR, 10);
        //调用get方法获取年月日
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
            public void set(int field, int value) ：将给定的日历字段设置为给定值。
     */
    private static void show02() {
        //获取calendar的子类对象
        Calendar c = Calendar.getInstance();
        //设置年为8888年
        c.set(Calendar.YEAR, 8888);

        //同时设置年月日,了解
        c.set(9999, 9, 9);
    }

    /*
        public int get(int field) ：返回给定日历字段的值。
     */
    private static void show01() {
        //获取calendar的子类对象
        Calendar c = Calendar.getInstance();
        //调用get方法获取年月日
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);//month+1

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
