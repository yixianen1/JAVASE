package com.yixianen.demo07BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream:字节缓冲输出流
    继续自父类OutputStream中的成员方法:
        void write(int b)  写一个字节
        void write(byte[] b)  写一个字节数组
        void write(byte[] b, int off, int len)  写字节数组的一部分,off数组的开始索引,len写的字节个数
        void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
        void close() 关闭此输出流并释放与此流有关的所有系统资源。
    构造方法:
        BufferedOutputStream(OutputStream out)
            创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
        BufferedOutputStream(OutputStream out, int size)
            创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
        参数:
            OutputStream out:字节输出流
                我们可以传递FileOutputStream,BufferedOutputStream就会给FileOutputStream增加一个缓冲区(数组)
                提高FileOutputStream写入数据的效率
            int size:指定缓冲区的大小
    字节缓冲输出流的使用步骤(重点):
        1.创建字节缓冲输出流BufferedOutputStream对象,构造方法中传递FileOutputStream对象
        2.使用BufferedOutputStream对象中的方法write,把数据写入到内存缓冲区中
        3.使用BufferedOutputStream对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        4.释放资源
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建字节缓冲输出流BufferedOutputStream对象,构造方法中传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\bu.txt"));
        //2.使用BufferedOutputStream对象中的方法write,把数据写入到内存缓冲区中
        bos.write("我是把数据写入到缓冲区".getBytes());
        //3.使用BufferedOutputStream对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        bos.flush();
        //4.释放资源
        bos.close();
    }
}
