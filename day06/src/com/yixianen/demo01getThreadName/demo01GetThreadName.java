package com.yixianen.demo01getThreadName;


/*
    线程的名称:
        主线程:main
        新线程:Thread-0,Thread-1...Thread-n
 */
public class demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法,开启新的线程执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

        //获取主线程的名称
        System.out.println(Thread.currentThread().getName());//main

    }
}
