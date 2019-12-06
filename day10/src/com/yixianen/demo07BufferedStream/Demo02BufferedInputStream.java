package com.yixianen.demo07BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream:字节缓冲输入流
    继续自父类InputStream中的成员方法:
        - public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        - public abstract int read()： 读取一个字节,并返回
        - public int read(byte[] b)： 读取多个字节,存储到数组中返回
     构造方法:
        BufferedInputStream(InputStream in)
            创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        BufferedInputStream(InputStream in, int size)
            创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
        参数:
              InputStream in:字节输入流
                我们可以传递FileInputStream,BufferedInputStream就会给FileInputStream增加一个缓冲区
                提高FileInputStream读取的效率
              int size:指定缓冲区的大小(数组的大小)
    字节缓冲输入流的使用步骤(重点):
       1.创建BufferedInputStream对象,构造方法中传递FileInputStream对象
       2.使用BufferedInputStream对象read,读取文件
       3.释放资源
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedInputStream对象,构造方法中传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\bu.txt"));
        //2.使用BufferedInputStream对象read,读取文件
        //public abstract int read()： 读取一个字节,并返回
        /*int len = 0;
        while((len = bis.read())!=-1){
            System.out.println(len);
        }*/

        //public int read(byte[] b)： 读取多个字节,存储到数组中返回
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //3.释放资源
        bis.close();
    }
}
