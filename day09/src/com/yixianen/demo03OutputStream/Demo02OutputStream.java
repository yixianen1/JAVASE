package com.yixianen.demo03OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输出流中写多个字节的方法
        void write(byte[] b)  写一个字节数组
        void write(byte[] b, int off, int len)  写字节数组的一部分,off数组的开始索引,len写的字节个数
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象,构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(new File("day09\\2.txt"));
        //2.调用FileOutputStream对象中的方法write,把数据写入到目的地
        //面试题:在文件中显示100,怎么写?
        //fos.write(100);//d
        fos.write(49);//1
        fos.write(48);//0
        fos.write(48);//0

        /*
            void write(byte[] b)  写一个字节数组
            了解:
                写多个字节的时候,第一个字节是正数,那么查询文件的时候,会查询ASCII表
                写多个字节的时候,第一个字节如果是负数,那么第一个字节会和第二个字节/第一个字节或者第二三个字节组成一个中文
                    那么查询文件的时候,会查询系统码表(GBK)
         */
        byte[] bytes = {65,66,67,68,69};//ABCDE
        //byte[] bytes = {-65,-66,-67,68,69};//烤紻E  GBK编码
        fos.write(bytes);

        /*
            void write(byte[] b, int off, int len)  写字节数组的一部分,off数组的开始索引,len写的字节个数
         */
        fos.write(bytes,1,2);//BC

        /*
            便捷写字符的方法
            String类有一个方法getBytes
                byte[] getBytes()  把字符串转换为字节数组
         */
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));//[-28, -67, -96, -27, -91, -67] UTF-8
        fos.write(bytes2);

        //3.释放资源
        fos.close();
    }
}
