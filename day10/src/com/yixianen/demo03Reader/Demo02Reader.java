package com.yixianen.demo03Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader:字符输入流
        此抽象类是表示字符输入流的所有类的超类。
    里边定义了所有字符输入流中共性的成员方法:
        - public void close() ：关闭此流并释放与此流相关联的任何系统资源。
        - public int read()： 一次读取一个字符,并返回;读取到文件结尾返回-1
        - public int read(char[] cbuf)： 一次读取多个字符,存储到数组中,返回的是每次读取的有效字符个数

    java.io.FileReader extends InputStreamReader extends Reader
        文件字符输入流
        作用:把硬盘文件中的数据,以字符的方式读取的内存中
    构造方法:
        FileReader(File file)
        FileReader(String fileName)
        参数:读取文件的数据源
            File file:数据源是一个文件
            String fileName:数据源是一个文件路径
    构造方法的作用:
        1.创建FileReader对象
        2.把FileReader对象指向读取文件的第一个字符

    读取的底层原理:
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

    字符输入流的使用步骤(重点):
        1.创建字符输入流FileReader对象,构造方法中绑定要读取的数据源
        2.使用FileReader对象中的方法read,读取文件
        3.释放资源
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        //1.创建字符输入流FileReader对象,构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("day10\\3.txt");
        //2.使用FileReader对象中的方法read,读取文件

        //public int read()： 一次读取一个字符,并返回;读取到文件结尾返回-1
        /*int len = 0;
        while((len = fr.read())!=-1){
            System.out.print((char)len);
        }*/

        //public int read(char[] cbuf)： 一次读取多个字符,存储到数组中,返回的是每次读取的有效字符个数
        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars))!=-1){
            /*
                String类的构造方法
                    String(char[] value) 把字符数组转换为字符串
                    String(char[] value, int offset, int count) 把字符数组一部分转换为字符串
             */
            System.out.print(new String(chars,0,len));
        }


        //3.释放资源
        fr.close();

        //System.out.println((char)20320);
        //System.out.println((char)22909);
    }
}
