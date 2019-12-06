package com.yixianen.demo01BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader:字符缓冲输入流
    继承自父类Reader的共性成员方法:
        - public void close() ：关闭此流并释放与此流相关联的任何系统资源。
        - public int read()： 一次读取一个字符,并返回;读取到文件结尾返回-1
        - public int read(char[] cbuf)： 一次读取多个字符,存储到数组中,返回的是每次读取的有效字符个数
    构造方法:
        BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
        参数:
           Reader in:字符输入流
                我们可以传递FileReader,BufferedReader会给FileReader增加一个缓冲区,提高FileReader读取数据的效率
           int sz:手动指定缓冲区的大小
    特有的成员方法:
        String readLine() 读一行文本
            通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行(\r\n)。
        返回：
            包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
    使用步骤:
        1.创建字符缓冲输入流BufferedReader对象,构造方法中传递FileReader对象
        2.使用BufferedReader对象中的方法read/readLine,读取文件
        3.释放资源
 */
public class Demo02BufferedReader {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输入流BufferedReader对象,构造方法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\1.txt"));
        //2.使用BufferedReader对象中的方法read/readLine,读取文件
        /*
            返现读取每行文本是一个重复的过程,所以可以使用循环优化
            不知道文件中有多少行数据,所以使用while循环
            while循环结束的条件,readLine方法读取到null
         */
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }


        //3.释放资源
        br.close();


        /*String line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);//null*/
    }
}
