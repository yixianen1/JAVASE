package com.yixianen.demo05IOException;

import java.io.FileWriter;
import java.io.IOException;

/*
    在JDK7前使用try_catch_finally处理流中的异常
    格式:
        try{
            可能会 产生异常的代码(没有异常的代码也可以放)
        }catch(Exption e){
            异常的处理逻辑
        }finally{
            一定会执行的代码,用于资源释放
        }
 */
public class Demo01JDK7Before {
    public static void main(String[] args) {
        //提高变量作用域,方便finally可以使用
        FileWriter fw = null;
        try{
            //可能会产生的代码
            fw = new FileWriter("w:\\day10\\7.txt",true);
            for (int i = 1; i <=10 ; i++) {
                fw.write("hello"+i+"\r\n");
            }
        }catch (Exception e){
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            //一定会指定的代码,用于资源释放
            /*
                Variable 'fw' might not have been initialized
                如果创建FileWriter对象失败,fw变量是没有初始化值的,所以会报错
                变量定义的时候可以没有值,但是使用的时候必须有值
             */
            /*
                close方法本身有异常,所以需要继续try...catch
             */
            /*
                如果创建FileWriter对象失败,fw变量初始值是null
                而null是不能调用方法的
                所以fw.close()会抛出NullPointerException
             */
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("后续代码!");

    }
}
