package com.yixianen.demo04PrintStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/*
    java.io.PrintStream extends OutputStream:打印流

    打印流的特点:
        1.为其他输出流添加了功能(print方法,println方法)，使它们能够方便地打印各种数据值表示形式。
        2.与其他输出流不同，PrintStream 永远不会抛出 IOException,可能会抛出文件找不到异常
        3.不能读取文件,只能写(输出)

    构造方法:
        PrintStream(File file) 输出的目的地是一个文件
        PrintStream(OutputStream out)输出的目的地是一个字节输出流
        PrintStream(String fileName)输出的目的地是一个文件路径
    继承自父类OutputStream的共性成员方法:打开文件查看数据的时候会查询编码表
        void write(int b)  写一个字节
        void write(byte[] b)  写一个字节数组
        void write(byte[] b, int off, int len)  写字节数组的一部分,off数组的开始索引,len写的字节个数
        void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
        void close() 关闭此输出流并释放与此流有关的所有系统资源。
    自己特有的成员方法:不会查询编码表,原样输出
        void print(任意类型的数据) :不换行
        void println(任意类型的数据):换行

    使用步骤:
        1.创建打印流PrintStream对象,构造方法中绑定要输出的目的地
        2.使用打印流PrintStream对象中的方法write,print,println,把数据写入到目的地
        3.释放资源
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(97);//a
        //1.创建打印流PrintStream对象,构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("day11\\print.txt");
        //2.使用打印流PrintStream对象中的方法write,print,println,把数据写入到目的地
        //继承自父类OutputStream的共性成员方法:打开文件查看数据的时候会查询编码表
        ps.write(97);//a

        //自己特有的成员方法:不会查询编码表,原样输出
        ps.print(97);//97
        ps.println("你好");
        ps.println(true);
        ps.println('*');
        ps.println(9.9);

        //3.释放资源
        ps.close();
    }
}
