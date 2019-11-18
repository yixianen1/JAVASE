package com.yixianen.demo02Exception;

/*
    finally关键字:
    作用:
        无论程序是否出现异常,finally中的代码都会执行
    格式:
        try{
            可能会产生异常的代码(没有异常的代码也可以放进来)
        }catch(异常类的数据类型 变量名){
            异常的处理逻辑(随意编写)
        }
        ...
        catch(异常类的数据类型 变量名){
            异常的处理逻辑(随意编写)
        }finally{
            无论是否异常,都会执行的代码,一般用于资源释放(IO)
        }
 */
public class Demo03TryCatchFinally {
    public static void main(String[] args) throws Exception {
        /*try {
            //可能会产生异常的代码
            //throw new Exception("我是一个编译期异常");
            System.out.println("1");
        } catch (Exception e) {
            //异常的处理逻辑
            e.printStackTrace();
        } finally {
            System.out.println("无论是否异常,都会执行的代码,一般用于资源释放(IO)");
        }*/


        try {
            //可能会产生异常的代码
            throw new Exception("我是一个编译期异常");
            //System.out.println("1");
        } finally {
            System.out.println("无论是否异常,都会执行的代码,一般用于资源释放(IO)");
        }
    }
}























