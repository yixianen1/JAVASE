package com.yixianen.demo02Lambda;

/*
    多线程程序:实现Runnable的方式
 */
public class Demo01Runnbale {
    public static void main(String[] args) {
        RunnableImpl r= new RunnableImpl();
        new Thread(r).start();

        /*
            可以使用匿名内部类简化
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->执行了线程任务");
            }
        }).start();
    }
}
