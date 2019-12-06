package com.yixianen.demo02ReverseStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
    java.io.InputStreamReader extends Reader:字符转换输入流
    作用:
        是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。
        字节->字符:解码
    继承自父类Reader的共性成员方法:
        - public void close() ：关闭此流并释放与此流相关联的任何系统资源。
        - public int read()： 一次读取一个字符,并返回;读取到文件结尾返回-1
        - public int read(char[] cbuf)： 一次读取多个字符,存储到数组中,返回的是每次读取的有效字符个数
    构造方法:
        InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader。
        InputStreamReader(InputStream in, String charsetName)  创建使用指定字符集的 InputStreamReader。
        参数:
            InputStream in:字节输入流,读取文件中保存的字节
            String charsetName:指定的编码表名称,不区分大小写,GBK/gbk,...UTF-8/utf-8/utf8;不写默认使用IDE的编码(UTF-8)
    使用步骤:
        1.创建InputStreamReader字符转换输入流对象,构造方法中绑定字节输入流和指定的编码表名称
        2.使用InputStreamReader对象中的方法read,读取文件
        3.释放资源
    注意:
        构造方法中指定的编码表名称必须和文件的编码相同,否则会发生乱码
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws Exception {
        //read_utf8();
        read_gbk();
    }

    /*
        使用InputStreamReader字符转换输入流读取UTF-8编码格式的文件
     */
    private static void read_gbk() throws Exception {
        //1.创建InputStreamReader字符转换输入流对象,构造方法中绑定字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\gbk.txt"),"GBK");
        //2.使用InputStreamReader对象中的方法read,读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        //3.释放资源
        isr.close();
    }

    /*
        使用InputStreamReader字符转换输入流读取UTF-8编码格式的文件
     */
    private static void read_utf8() throws Exception {
        //1.创建InputStreamReader字符转换输入流对象,构造方法中绑定字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\utf8.txt"),"utf-8");
        //2.使用InputStreamReader对象中的方法read,读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char)len);
        }
        //3.释放资源
        isr.close();
    }
}
