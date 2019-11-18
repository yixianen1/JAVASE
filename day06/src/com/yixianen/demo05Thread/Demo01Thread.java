package com.yixianen.demo05Thread;

import com.yixianen.demo01getThreadName.MyThread;

/*
    匿名内部类方式实现多线程程序

    匿名内部类作用:简化代码
        把子类继承父类,重写父类的方法,创建子类对象,合成一步完成
        把实现类实现接口,重写接口库的方法,创建实现类对象,合成一步完成
        最终产生物:子类对象,实现类对象

    格式:
        new 父类/接口(){
            重写父类/接口中的方法
        };
 */
public class Demo01Thread {
    public static void main(String[] args) {
        //父类 Thread
//        new MyThread().start();

        new Thread(){
            //重写run方法,设置线程任务
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();




        //接口 Runnable
        //new Thread(new RunnableImpl()).start();
        new Thread(new Runnable() {
            //重写run方法,设置线程任务
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }).start();

        //Lambda 简化内部类
        new Thread(()->{
            for (int i = 0; i <20 ; i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        }).start();
    }
}
