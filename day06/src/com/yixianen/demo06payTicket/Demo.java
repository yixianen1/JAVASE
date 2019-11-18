package com.yixianen.demo06payTicket;

/*
    代码块:就是一对{}
 */
public class Demo {

    //成员代码块,构造代码块,创建一次对象,会执行一次
    {

    }

    //静态代码块终身只执行一次,优先执行
    static {

    }


    public static void main(String[] args) {
        //方法中的代码快叫局部代码块
        {
            int a = 0;//控制变量的作用域
            System.out.println(a);
        }
    }
}
