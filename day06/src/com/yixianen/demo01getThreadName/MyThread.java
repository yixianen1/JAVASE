package com.yixianen.demo01getThreadName;

/*
    获取线程的名称:
        1.可以使用Thread类中的方法getName
            String getName() 返回该线程的名称。
        2.可以先获取当前正在执行的线程,在通过getName方法获取线程名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        //1.可以使用Thread类中的方法getName
        //String name = getName();
        //System.out.println(name);

        //2.可以先获取当前正在执行的线程
        //Thread currentThread = Thread.currentThread();
        //System.out.println(currentThread);//Thread[Thread-0,5,main]

        //String name = currentThread.getName();
        //System.out.println(name);//Thread-0

        //链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
