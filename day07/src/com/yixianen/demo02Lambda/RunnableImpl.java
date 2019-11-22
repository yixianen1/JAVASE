package com.yixianen.demo02Lambda;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        //设置线程任务
        System.out.println(Thread.currentThread().getName()+"-->执行了线程任务");
    }
}
