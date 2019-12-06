package com.yixianen.demo01BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends Writer:字符缓冲输出流
    继承自父类Writer的共性成员方法:
        - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
        - public void write(int c) ：写出一个字符。
        - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
        - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
        - public void write(String str) ：写出一个字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分。
    构造方法:
        BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流。
        BufferedWriter(Writer out, int sz) 创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
        参数:
            Writer out:字符输出流
                我们可以传递FileWriter,BufferedWriter就会给FileWriter增加一个缓冲区,提高FileWriter写数据的效率
            int sz:手动指定缓冲区的大小
    特有的成员方法:
        void newLine() 写入一个行分隔符。屏蔽了系统之间的不同,在不同的系统会获取不同的换行符号
            windows:\r\n
            linux:/n
            mac:/r
    使用步骤(重点):
        1.创建字符缓冲输出流BufferedWriter对象,构造方法中传递FileWriter对象
        2.使用BufferedWriter对象中的方法write,把数据写内存缓冲区中
        3.释放资源(会调用flush,把内存缓冲区中的数据刷新到文件中)
 */
public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        //System.out.println();//newLine();调用的就是newLine方法
        //1.创建字符缓冲输出流BufferedWriter对象,构造方法中传递FileWriter对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\1.txt"));
        //2.使用BufferedWriter对象中的方法write,把数据写内存缓冲区中
        for (int i = 1; i <=10 ; i++) {
            bw.write("你好"+i);
            //bw.write("\r\n");
            bw.newLine();
        }
        //3.释放资源(会调用flush,把内存缓冲区中的数据刷新到文件中)
        bw.close();
    }
}
