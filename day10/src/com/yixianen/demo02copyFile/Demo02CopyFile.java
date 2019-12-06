package com.yixianen.demo02copyFile;

import java.io.*;

/*
    使用缓冲流复制文件:效率高

    明确:
        数据源: c:\\1.jpg
        目的地: d:\\1.jpg

    使用步骤:
        1.创建字节缓冲输入流BufferedInputStream对象,构造方法传递FileInputStream对象
        2.创建字节缓冲输出流BufferedOutputStream对象,构造方法传递FileOutputStream对象
        3.使用BufferedInputStream对象read,读取文件
        4.使用BufferedOutputStream对象,把读取到的数据,写入内部缓冲区
        5.释放资源(会先刷新)
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建字节缓冲输入流BufferedInputStream对象,构造方法传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\1.exe"));
        //2.创建字节缓冲输出流BufferedOutputStream对象,构造方法传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\1.exe"));
        //一次读取一个字节,写一个字节的方式复制文件
        /*int len = 0;
        while((len = bis.read())!=-1){
            bos.write(len);
        }*/

        //一定读取多个字节,写入多个字节的方式复制文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //5.释放资源(会先刷新)
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");  // 227毫秒  26毫秒
    }
}
