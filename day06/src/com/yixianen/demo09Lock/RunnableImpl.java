package com.yixianen.demo09Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题:票出现的重复的票和不存在的票
    解决线程安全问题的第三种方式:使用Lock锁

    java.util.concurrent.locks.Lock接口
    是JDK1.5之后的新特性
    Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
    Lock接口中的方法:
        void lock() 获取锁。
        void unlock() 释放锁。

   java.util.concurrent.locks.ReentrantLock implements Lock

   使用步骤:
        1.在成员位置创建一个Lock接口的实现类对象ReentrantLock
        2.在可能会出现安全问题的代码前,调用lock方法获取锁对象
        3.在可能会出现安全问题的代码后,调用unlock方法释放锁对象

 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    //1.在成员位置创建一个Lock接口的实现类对象ReentrantLock
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //2.在可能会出现安全问题的代码前,调用lock方法获取锁对象
            l.lock();
            if(ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票!");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3.在可能会出现安全问题的代码后,调用unlock方法释放锁对象
                    l.unlock(); //无论程序是否异常,都会把锁对象释放,节约内存提高程序的效率
                }

            }
        }
    }

    /*@Override
    public void run() {
        while (true){
            //2.在可能会出现安全问题的代码前,调用lock方法获取锁对象
            l.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票!");
                    ticket--;
                }
            //3.在可能会出现安全问题的代码后,调用unlock方法释放锁对象
            l.unlock();
        }
    }*/
}
