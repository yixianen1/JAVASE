package com.yixianen.demo01InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类。
    里边定义了所有字节输入流中共性的成员方法:
        - public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        - public abstract int read()： 读取一个字节,并返回
        - public int read(byte[] b)： 读取多个字节,存储到数组中返回

    java.io.FileInputStream extends InputStream
    文件字节输入流
    作用:把文件中的数据,以字节的方式读取到内存中

    构造方法:
        FileInputStream(File file)
        FileInputStream(String name)
        参数:读取的数据源
            File file:数据源是一个文件
            String name:数据源是一个文件的路径

    构造方法的作用:
        1.创建一个FileInputStream对象
        2.会把FileInputStream对象指向要读取文件的第一个字节

    读取数据的底层原理:
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件


    字节输入流的使用步骤(重点):
        1.创建字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read,读取文件
        3.释放资源

     注意:构造方法中指定的文件不存在,会抛出文件找不到异常
     FileNotFoundException: day10\1.txt (系统找不到指定的文件。)
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day10\\1.txt");
        //2.使用FileInputStream对象中的方法read,读取文件
        //public abstract int read()： 读取一个字节,并返回

        /*
            我们发现读取文件的过程是一个重复的过程
            所以可以使用循环优化,不知道文件中有多少数据
            所以使用while循环,循环结束条件,read方法返回-1

            while循环的布尔表达式
                1.fis.read():读取一个字节
                2.len = fis.read()把读取到的字节赋值给变量len
                3.(len = fis.read())!=-1 判断变量len是否为-1

         */
        int len = 0;
        while((len = fis.read())!=-1){
            System.out.println(len);
        }



        //3.释放资源
        fis.close();

        /*int len = fis.read();
        System.out.println(len);//97 a

        len = fis.read();
        System.out.println(len);//98 b

        len = fis.read();
        System.out.println(len);//99 c

        len = fis.read();
        System.out.println(len);//-1*/

    }
}


















