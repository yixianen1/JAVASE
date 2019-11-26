package com.yixianen.demo03OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream:字节输出流
        此抽象类是表示输出字节流的所有类的超类。
        里边定义了所有字节输出流共性的成员方法
            void write(int b)  写一个字节
            void write(byte[] b)  写一个字节数组
            void write(byte[] b, int off, int len)  写字节数组的一部分,off数组的开始索引,len写的字节个数
            void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
            void close() 关闭此输出流并释放与此流有关的所有系统资源。
    java.io.FileOutputStream extends  OutputStream
        文件字节输出流

    FileOutputStream的构造方法
        FileOutputStream(String name)
        FileOutputStream(File file)
        参数:输出的目的地
           String name:目的地是一个文件的路径
           File file:目的地是一个文件
    FileOutputStream的构造方法作用:
        1.会根据参数传递的目的地,创建一个文件;如果文件已经存在会覆盖
        2.会创建一个FileOutputStream对象
        3.会把FileOutputStream对象指向创建好的文件

   写入数据到文件底层原理:
        java程序-->JVM-->操作系统(OS)-->调用系统的方法-->把数据写入到目的地

   字节输出流的使用步骤(重点):
        1.创建FileOutputStream对象,构造方法中绑定输出的目的地
        2.使用FileOutputStream对象中的方法write,把数据写入到目的地
        3.释放资源

   FileOutputStream fos = new FileOutputStream("w:\\day09\\1.txt");
   java.io.FileNotFoundException: w:\day09\1.txt (系统找不到指定的路径。)
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象,构造方法中绑定输出的目的地
        FileOutputStream fos = new FileOutputStream("day09\\1.txt");
        //2.使用FileOutputStream对象中的方法write,把数据写入到目的地
        //void write(int b)  写一个字节
        fos.write(97);
        //3.释放资源
        fos.close();
    }
}
