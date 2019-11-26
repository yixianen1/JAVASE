package com.yixianen.demo03OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    续写/追加写:使用两个参数构造方法
        FileOutputStream(File file, boolean append)
        FileOutputStream(String name, boolean append)
        参数:
            File file,String name:写入数据的目的地
            boolean append:追加写的开关;
                true:创建对象不会覆盖之前的文件,写数据会在文件末尾继续写
                false:创建对象会创建一个新文件覆盖之前的文件,会在新文件中写数据(不写默认false)
   换行:可以使用换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象,构造方法中绑定输出目的地和追加写开关
        FileOutputStream fos = new FileOutputStream("day09\\3.txt",true);
        //2.调用FileOutputStream对象中的方法write,把数据写入到目的地中
        for (int i = 0; i <10 ; i++) {
            fos.write("hello".getBytes());
            //写换行符号
            fos.write("\r\n".getBytes());
        }
        //3.释放资源
        fos.close();
    }
}
