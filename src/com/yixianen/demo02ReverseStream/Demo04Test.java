package com.yixianen.demo02ReverseStream;

import java.io.*;

/*
    练习：转换文件编码
        将GBK编码的文本文件，转换为UTF-8编码的文本文件。

    案例分析
        1. 指定GBK编码的转换流，读取文本文件。
        2. 使用UTF-8编码的转换流，写出文本文件。
    什么时候使用便捷的字符流:操作文件的编码固定就是IDE的默认编码(UTF-8)
        FileReader
        FileWriter
        使用起来简单:不用传递编码表,不用创建字节流
    什么时候使用转换字符流 :操作文件的编码不是IDE的默认编码(UTF-8)
        InputStreamReader
        OutputStreamWriter
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //创建字符转换输入流InputStreamReader对象,构造方法中绑定字节输入流对象和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\我是GBK编码格式的文件.txt"),"GBK");
        //创建字符转换输出流OutputStream对象,构造方法中绑定字节输出流和指定的编码表名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\我是UTF8编码格式的文件.txt"),"UTF-8");
        FileWriter osw = new FileWriter("day11\\我是UTF8编码格式的文件.txt");
        //使用InputStreamReader对象中的方法read读取文件
        char[] chars = new char[1024];
        int len = 0;
        while((len = isr.read(chars))!=-1){
            //使用OutputStreamWriter对象中的方法write,把读取到的字符写入到内存缓冲区中
            osw.write(chars,0,len);
        }
        //释放资源
        osw.close();
        isr.close();
    }
}
