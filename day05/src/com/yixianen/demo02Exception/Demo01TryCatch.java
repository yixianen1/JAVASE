package com.yixianen.demo02Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try...catch关键字:异常处理的第二种方式(自己捕获处理异常)
    作用:
        当方法内部抛出异常对象时,我们可以使用try...catch处理异常对象
        好处:程序如果有后续代码,会把异常处理完毕之后继续执行
    格式:
        try{
            可能会产生异常的代码(没有异常的代码也可以放进来)
        }catch(异常类的数据类型 变量名){
            异常的处理逻辑(随意编写)
        }
        ...
        catch(异常类的数据类型 变量名){
            异常的处理逻辑(随意编写)
        }
     注意:
        1.catch中定义的异常变量是根据try中抛出的异常来定义;一般抛出什么对象,就定义什么异常变量来接收这个异常对象
        2.try中可以能会抛出多个异常对象,就可以定义多个catch来分别处理这些异常对象
        3.try代码中如果出现了异常,那么就不会继续执行try中的代码,会执行catch中异常的处理逻辑,执行完毕;继续执行try...cath之后的代码
          try代码中如果没有出现异常,正常执行try中的代码,执行完毕,不会执行catch中异常的处理逻辑,会执行执行try...cath之后的代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            checkFilePath("d:\\a.txt");
        } catch (FileNotFoundException e) {
            //异常的处理逻辑(随意编写)
            System.out.println("发生了FileNotFoundException异常");
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
