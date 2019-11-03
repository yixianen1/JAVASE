package com.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat类
        是日期/时间格式化子类的抽象类
        DateFormat类 extends Format类
    作用：
        格式化（日期->文本）
        解析（文本->日期）
    成员方法：
        String format(Date date) : 根据指定的模式，把Date日期，格式化为文本
        Date parse(String source) : 把符合模式的字符串，解析为Date日期
    DateFormat类是一个抽象类，无法创建对象，需要使用DateFormat类的子类

    java.text.SimpleDateFormat extents DateFormat
    构造方法：
        SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
        参数：
            String pattern ： 模式
            当出现y代表年
            当出现M代表月
            当出现d代表日
            当出现H代表时
            当出现m代表分
            当出现s代表秒
            例如：
                yyyy-MM-dd HH:mm:ss
                yyyy年MM月dd日 HH时mm分ss秒
                yyyy/MM/dd
            注意：
                表示模式的符号（y,m...）不能改变，是一个固定的
                链接模式的连接符（-，/...）可以随意使用
 */
public class Demo01DateFormat {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        学习目标：
            能够使用字符串转化为日期的方法
            Date parse(String source) : 把符合模式的字符串，解析为Date日期

            public Date parse(String source) throws ParseException

     */
    private static void show02() {
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.调用SimpleDateFormat对象中的方法parse，把符合模式的字符串，解析为Date日期
        try {
            Date date = sdf.parse("2019-11-03 11:39:25");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /*
        学习目标：
            能够使用将日期转化为字符串的方法
            String format(Date date) : 根据指定的模式，把Date日期，格式化为文本
     */
    private static void show01() {
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.调用SimpleDateFormat对象中的方法format，把Date日期按照构造方法中传递的模式，格式化为字符串
        String s = sdf.format(new Date());
        System.out.println(s);
    }
}
