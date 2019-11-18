package com.yixianen.demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    能够辨别程序中异常和错误的区别
    异常:程序出现的小问题-->感冒了,发烧了-->吃点药可以治疗-->继续革命工作
        编译期异常:写代码的时候,程序出现了异常
            运行期异常:运行程序的时候,出现的异常
        异常都是可以解决,异常解决之后,程序可以继续执行
    错误:程序出现了严重问题-->非典,艾滋-->无法治愈-->从新创建一个人
        出现了错误,必须修改源代码,让错误不在出现
 */
public class Demo01ErrorAndException {
    public static void main(String[] args) /*throws ParseException*/ {
        //编译期异常:写代码的时候,程序出现了异常
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2018-0830");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //运行期异常:运行程序的时候,出现的异常
        /*try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }*/

        //错误:程序出现了严重问题
        /*
            OutOfMemoryError: Java heap space
            内存溢出的错误
            创建的数组太大了,超出了java内存使用范围
         */
        //int[] arr = new int[1024*1024*1024];
        // 出现了错误,必须修改源代码,让错误不在出现
        int[] arr = new int[1024*1024];

        System.out.println("后续代码!");
    }
}
