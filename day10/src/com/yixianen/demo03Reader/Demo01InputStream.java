package com.yixianen.demo03Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取带中文的文件
    UTF-8:1个中文=3个字节
        你好:
            228
            189
            160
            229
            165
            189
    GBK:1个中文=2个字节

    注意:
        字节流:一次读写一个字节
        字符类:一次读写一个字符
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10\\3.txt");
        int len = 0;
        while((len = fis.read())!=-1){
            System.out.print((char)len);//ä½ å¥½
        }

        //3.释放资源
        fis.close();
    }
}


















