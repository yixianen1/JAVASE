package com.yixianen.demo07test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    重点:会处理异常
        throws:终止程序
        try...catch:可以执行后续代码
        throw:在方法内部抛出指定的异常对象
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2018-08");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        System.out.println("后续代码");
    }
}
