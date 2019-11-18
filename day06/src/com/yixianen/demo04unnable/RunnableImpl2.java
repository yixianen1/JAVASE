package com.yixianen.demo04unnable;

//1.创建一个类实现Runnable接口
public class RunnableImpl2 implements Runnable{
    //2.重写Runnable接口中的run方法,设置线程任务
    @Override
    public void run() {
        //新线程执行的代码
        for (int i = 0; i <20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+"HelloWorld");
        }
    }
}
