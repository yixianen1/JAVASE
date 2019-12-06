package com.yixianen.demo05IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    在JDK7后使用try_catch处理流中的异常
    新特性:
        在try的后边可以增加一个(),在()中可以定义流对象
        这样流对象的作用域就在()中有效,()中的代码执行完毕,那么这个流对象就会自动的释放
        不用写finally
    格式:
        try(定义流对象;...){
            可能会产生的代码(没有异常的代码也可以放)
        }catch(Exption e){
            异常的处理逻辑
        }
 */
public class Demo02JDK7After {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();

        try(FileInputStream fis = new FileInputStream("c:\\1.jpg");
            FileOutputStream fos = new FileOutputStream("d:\\1.jpg");){
            byte[] bytes = new byte[1024*100];
            int len = 0;
            while((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //流已经释放了,就不能在使用了
        //fis.read();

        /*for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        System.out.println(i);*/


        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");  // 61726毫秒  15毫秒
    }
}
