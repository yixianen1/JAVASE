package com.yixianen.demo04Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流中其他写数据的方法:
        - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
        - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
        - public void write(String str) ：写出一个字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        //创建字符输出流FileWriter对象,构造方法中绑定要写的目的地
        FileWriter fw = new FileWriter("day10\\6.txt");
        //使用FileWriter对象中的方法write,把数据写入到内存缓冲区中

        //public void write(char[] cbuf)
        char[] chars = {'a','b','1','$','中'};
        fw.write(chars);//ab1$中

        //public abstract void write(char[] b, int off, int len)
        fw.write(chars,2,2);//1$

        //public void write(String str) ：写出一个字符串。
        fw.write("你好,我好,大家好!");//你好,我好,大家好!

        //void write(String str, int off, int len) 写入字符串的某一部分
        fw.write("我想有一个女同桌!",5,3);//女同桌

        //释放资源
        fw.close();
    }
}
