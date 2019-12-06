package com.yixianen.demo02copyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制:一读一写就是文件复制

    明确:
        数据源: c:\\1.jpg
        目的地: d:\\1.jpg

    文件复制的步骤:
        1.创建文件字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建文件字节输出流FileOutputStrem对象,构造方法中绑定要写入的目的地
        3.使用FileInputStream对象中的方法read,读取文件
        4.使用FileOutputStrem对象write,把读取到的数据写入到目的地中
        5.释放资源(先关写,后关读)
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建文件字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("c:\\1.exe");
        //2.创建文件字节输出流FileOutputStrem对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("d:\\1.exe");
        //一次读取一个字节,写一个字节的方式复制文件
        //3.使用FileInputStream对象中的方法read,读取文件
        /*int len = 0;
        while((len = fis.read())!=-1){
            //4.使用FileOutputStrem对象write,把读取到的数据写入到目的地中
            fos.write(len);
        }*/

        //一定读取多个字节,写入多个字节的方式复制文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }


        //5.释放资源(先关写,后关读)
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:" + (e - s) + "毫秒");  // 61726毫秒  27毫秒
    }
}
