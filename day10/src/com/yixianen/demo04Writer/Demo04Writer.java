package com.yixianen.demo04Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符流的追加写和换行:
        追加写:使用两个参数的构造方法
            FileWriter(File file, boolean append)
            FileWriter(String fileName, boolean append)
            参数:
                File file,String fileName:写入数据的目的地
                boolean append:追加写开关
                    true:不会覆盖原有文件,在文件末尾继续追加写数据
                    false:会创建新的文件,覆盖原有的文件,在新文件中写数据
        换行:使用换行符号
            windows:\r\n
            linux: /n
            mac: /r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象,构造方法中传递写的目的地和追加写开关
        FileWriter fw = new FileWriter("day10\\7.txt",true);
        //调用FileWriter中的方法write,把数据写入到内存缓冲区中
        for (int i = 1; i <=10 ; i++) {
            fw.write("hello"+i+"\r\n");
        }
        //释放资源,并刷新数据到文件中
        fw.close();

        System.out.println("后续代码!");
    }
}
