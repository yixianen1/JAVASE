package com.yixianen.demo08Synchronized;

/*
    开启3个线程,同时进行卖票
 */
public class Demo01PayTicket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl r = new RunnableImpl();
        System.out.println("r:"+r);//RunnableImpl@58ceff1

        //创建3个线程
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        //开启新的线程
        t0.start();
        t1.start();
        t2.start();
    }
}
