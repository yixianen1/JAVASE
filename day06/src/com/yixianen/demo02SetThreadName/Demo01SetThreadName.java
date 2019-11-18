package com.yixianen.demo02SetThreadName;

/*
    设置线程的名称
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //1.可以使用Thread类中的方法setName
        mt.setName("小强");
        mt.start();

        new MyThread("旺财").start();
    }
}
