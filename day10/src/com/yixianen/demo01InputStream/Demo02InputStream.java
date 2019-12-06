package com.yixianen.demo01InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    使用字节输入流一次读取多个字节
        public int read(byte[] b)： 读取多个字节,存储到数组中返回
    明确两件事情:
        1.read方法的参数byte[]作用是什么?
            起到缓冲作用,可以把多次读取到的字节存储到数组中
            数组长度一般定义为1024(1kb),或者1024的整数倍
        2.read方法的返回值int是什么?
            每次读取到的有效字节个数

    String类的构造方法:
        String(byte[] bytes) 把字节数组转换为字符串
        String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串,offset:数组的开始索引,length:转换的字节个数

 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //创建字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day10\\2.txt");
        //调用FileInputStream对象中的方法read,读取文件

        /*
            发现读取的过程是一个重复的过程,所以可以使用循环优化
            不知道文件中有多少数据,所以使用while循环
            while循环结束的条件,读取到-1的时候结束
         */
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            //只把有效的字节个数转换为字符串
            System.out.println(new String(bytes,0,len));
        }

        //释放资源
        fis.close();

        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//AB

        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//CD

        len = fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//ED

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//ED*/
    }
}
