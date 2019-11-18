package com.yixianen.demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字:异常处理的第一种方式(声明抛出异常对象)
    作用:
        当方法内部抛出异常对象时,我们可以使用throws关键字处理这个异常对象
        会继续把异常对象声明抛出给方法的调用者处理
    格式:
        修饰符 返回值类型 方法名(参数) throws xxxException,yyyException...{
            throw new xxxException();
            throw new yyyException();
            ...
        }
    注意事项:
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常类名必须是Exception或者是throws关键字的子类
            一般方法内部抛出什么异常类型,就声明什么异常对象
        3.如果方法内部抛出了多个异常对象,那么throws后边就必须声明多个异常类
            抛出的多个异常对象有子父类关系,那么我们声明父类异常即可
        4.如果调用了一个声明抛出异常对象的方法,那么我们就必须处理这个异常对象
            a.可以使用throws继续声明抛出这个异常对象,最终给JVM处理-->中断处理
            b.可以使用try...catch自己处理这个异常对象
 */
public class Demo05Throws {
    /*
        FileNotFoundException extends IOException extends Exception
     */
    public static void main(String[] args) throws Exception {
        checkFilePath("d:\\a.java");

        System.out.println("后续代码!");
    }

    /*
        定义一个方法,对传递的文件路径进行合法性判断
     */
    public static void checkFilePath(String fileName) throws FileNotFoundException,IOException{
        /*
            对文件路径进行判断,判断路径是否是d:\\a.txt
            如果路径不是d:\\a.txt,那么我们就抛出异常对象
            告之方法的调用者,传递的路径不正确
         */
        /*if(!"d:\\a.txt".equals(fileName)){
            throw new FileNotFoundException("传递的路径不正确");
        }*/

        /*
            对文件路径的后缀进行判断,判断文件后缀是否是.txt结尾
            不是.txt结尾,那么我们就抛出异常对象
            告之方法的调用者,文件的后缀不对
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀不对");
        }

        System.out.println("读取文件!");
    }
}
