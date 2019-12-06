package com.yixianen.demo02ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader:字符输入流
        只能读取IDE默认编码格式的文件(UTF-8)
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day11\\我是GBK编码格式的文件.txt");
        int len = 0;
        while((len = fr.read())!=-1){
            System.out.print((char)len);//���
        }
        fr.close();
    }
}
