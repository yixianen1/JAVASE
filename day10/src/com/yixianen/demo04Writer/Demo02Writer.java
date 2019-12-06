package com.yixianen.demo04Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    close方法和flush方法区别:
        - flush ：刷新缓冲区，流对象可以继续使用。
        - close ：关闭流，释放系统资源。关闭前会刷新缓冲区。流已经关闭就不能在使用了
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        //创建字符输出流FileWriter对象,构造方法中绑定要输出的目的地
        FileWriter fw = new FileWriter("day10\\5.txt");
        //调用FileWriter中的方法write,把数据写入到内存缓冲区中
        fw.write(65);

        //调用flush方法,把内存缓冲区中的数据刷新到文件中
        fw.flush();

        //flush之后流可以继续使用
        fw.write(66);

        //调用close方法关闭流,释放资源
        fw.close();

        //close之后流就已经被释放了,流就不能使用了
        fw.write(67);//IOException: Stream closed
    }
}
