package com.yixianen.demo06Thread;

/*
    创建多线程程序的第一种方式:继承Thread类
    java.lang.Thread类:就是一个描述线程的类,我们的类想实现多线程,就必须继承Thread类
    线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程。
    java程序属于抢占式调度:
        优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一个线程执行(线程随机性)
        新的线程和main线程优先级相同,cpu会随机执行某一个线程,就会出现随机性的打印结果
        main-->0
        run-->0
        main-->1
        run-->1
        main-->2
        run-->2
        main-->3
        run-->3
        main-->4
        run-->4
        main-->5
        run-->5
        ....

    实现步骤:
        1.创建Thread类的子类,继承Thread类
        2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启新的线程目的是什么?要干什么事情?)
        3.创建Thread类的子类对象
        4.调用Thread类中的方法start开启新线程,执行线程任务run方法
            void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
            结果是两个线程并发地运行；当前线程（主线程:执行main方法中的代码）和另一个线程（新的线程,执行其 run 方法中的代码）。
            多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。-->start方法执行一次
 */
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //mt.run(); //不会开启新的线程
        //4.调用Thread类中的方法start开启新线程,执行线程任务run方法
        mt.start();

        //main线程会继续执行for循环
        for (int i = 0; i < 20; i++) {
            System.out.println("main-->"+i);
        }
    }
}
