package com.yixianen.demo06Thread;

//1.创建Thread类的子类,继承Thread类
public class MyThread extends Thread{
    //2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启新的线程目的是什么?要干什么事情?)
    @Override
    public void run() {
        //新的线程执行run方法
        for (int i = 0; i < 20; i++) {
            System.out.println("run-->"+i);
        }
    }
}
