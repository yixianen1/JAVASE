package com.yixianen.demo05Thread;

/*
    主线程:执行main方法的线程

    现在的程序是一个单线程的程序,只有一个线程
    程序的执行从main方法开始,从上到下逐行执行

    java程序进入到内存中
    JVM会先执行main方法
    JVM会找操作系统,开辟一条main方法通向cpu的路径
    cpu通过这个路径执行main方法
    而这个路径有一个名字,叫主线程(main线程)
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        System.out.println(0/0);

        Person p2 = new Person("旺财");
        p2.run();
    }
}
