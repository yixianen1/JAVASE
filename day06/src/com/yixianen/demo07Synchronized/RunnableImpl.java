package com.yixianen.demo07Synchronized;

/*
    卖票案例出现了线程安全问题:票出现的重复的票和不存在的票
    解决线程安全问题的第一种方式:使用同步代码块
    格式:
        synchronized(锁对象){
            出现安全问题的代码(访问了共享数据的代码)
        }
    注意:
        1.锁对象可以是任意对象  new Person  new Student ...
        2.必须保证多个线程使用的是同一个锁对象
        3.锁对象的作用:把{}中代码锁住,只让一个线程进去执行
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    //在成员位置创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                //访问了共享数据的代码
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票!");
                    ticket--;
                }
            }
        }
    }
}
