package com.yixianen.demo04Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流
    此抽象类是表示字符输出流的所有类的超类。
    里边定义了所有字符输出流中共性的成员方法:
        - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
        - public void write(int c) ：写出一个字符。
        - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
        - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
        - public void write(String str) ：写出一个字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分。

   java.io.FileWriter exntends OutputStreamWriter extends Writer
        文件字符输出流
        作用:把内存中的数据,以字符的方式写入到文件中

   构造方法:
        FileWriter(File file)
        FileWriter(String fileName)
        参数:写入数据的目的地
            File file:目的地是一个文件
            String fileName:目的地是一个文件的路径
   构造方法的作用:
        1.会根据构造方法传递的文件/文件的路径,创建一个空文件
        2.创建FileWriter对象
        3.把FileWriter对象指向创建的文件

   写入数据的底层原理:
        java-->JVM-->OS-->OS写数据的方法-->把数据写入到文件

   字符输出流的使用步骤(重点)
        1.创建字符输出流FileWriter对象,构造方法中绑定要写入的目的地
        2.使用FileWriter对象中的方法write,把数据写入到内存缓冲区中(转换 字符-->字节)
        3.使用FileWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        4.释放资源
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //1.创建字符输出流FileWriter对象,构造方法中绑定要写入的目的地
        FileWriter fw = new FileWriter("day10\\4.txt");
        //2.使用FileWriter对象中的方法write,把数据写入到内存缓冲区中(转换 字符-->字节)
        fw.write(97);
        //3.使用FileWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        //fw.flush();
        //4.释放资源(流关闭前,会自动的先调用flush方法,刷新数据)
        fw.close();
    }
}
