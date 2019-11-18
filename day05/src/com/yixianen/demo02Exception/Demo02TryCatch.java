package com.yixianen.demo02Exception;

import java.io.FileNotFoundException;

/*
    在java.lang.Throwable中有异常的处理方法
        String getMessage() 返回此 throwable 的简短描述。
        String toString() 返回此 throwable 的详细消息字符串。
        void printStackTrace()  打印的异常信息是最全面的,JVM默认就是调用此方法打印的异常信息
 */
public class Demo02TryCatch {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            checkFilePath("c:\\a.txt");
        } catch (FileNotFoundException e) {//FileNotFoundException e = new FileNotFoundException("传递的路径不正确");
            //异常的处理逻辑(随意编写)
            //System.out.println("发生了FileNotFoundException异常");
            //System.out.println(e.getMessage());//传递的路径不正确
            //System.out.println(e.toString());//java.io.FileNotFoundException: 传递的路径不正确
            /*
                java.io.FileNotFoundException: 传递的路径不正确
                at com.itheima.demo02.Exception.Demo02TryCatch.checkFilePath(Demo02TryCatch.java:37)
                at com.itheima.demo02.Exception.Demo02TryCatch.main(Demo02TryCatch.java:15)
             */
            e.printStackTrace();
        }

        System.out.println("后续代码");
    }

    /*
        定义一个方法,对传递的文件路径进行合法性判断
     */
    public static void checkFilePath(String fileName) throws FileNotFoundException {
        /*
            对文件路径进行判断,判断路径是否是d:\\a.txt
            如果路径不是d:\\a.txt,那么我们就抛出异常对象
            告之方法的调用者,传递的路径不正确
         */
        if(!"d:\\a.txt".equals(fileName)){
            throw new FileNotFoundException("传递的路径不正确");
        }


        System.out.println("读取文件!");
    }
}
