package com.yixianen.demo02ReverseStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
    java.io.OutputStreamWriter extends Writer:字符转换输出流
    作用:
        是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。
        字符->字节:编码
    继承自父类Writer的共性成员方法:
        - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
        - public void write(int c) ：写出一个字符。
        - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
        - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
        - public void write(String str) ：写出一个字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分。
    构造方法:
        OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
        参数:
            OutputStream out:字节输出流,把转换流转换之后的字节写入到文件中
            String charsetName:指定的编码表名称,不区分大小写,GBK/gbk,...UTF-8/utf-8/utf8;不写默认使用IDE的编码(UTF-8)
    使用步骤:
        1.创建字符转换输出流OutputStreamWriter对象,构造方法中绑定字节输入流对象和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中(字符->字节:编码)
        3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据,刷新到文件中(使用字节流写字节的过程)
        4.释放资源
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws Exception {
        //write_utf8();
        write_gbk();
    }

    /*
        使用字符转换输出流OutputStreamWriter写一个UTF-8编码格式的文件
     */
    private static void write_gbk() throws Exception {
        //1.创建字符转换输出流OutputStreamWriter对象,构造方法中绑定字节输入流对象和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\gbk.txt"),"GBK");
        //2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中(字符->字节:编码)
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据,刷新到文件中
        osw.flush();
        //4.释放资源
        osw.close();
    }

    /*
        使用字符转换输出流OutputStreamWriter写一个UTF-8编码格式的文件
     */
    private static void write_utf8() throws Exception {
        //1.创建字符转换输出流OutputStreamWriter对象,构造方法中绑定字节输入流对象和指定的编码表名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf8.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf8.txt"));//不写默认使用IDE的编码(UTF-8)
        //2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中(字符->字节:编码)
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据,刷新到文件中
        osw.flush();
        //4.释放资源
        osw.close();
    }

}
