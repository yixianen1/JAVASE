package com.yixianen.demo04unnable;

/*
    多线程程序的第二种实现方式:实现Runnable接口
    java.lang.Runnable接口
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
    java.lang.Thread类的构造方法:
        Thread(Runnable target) 分配新的 Thread 对象。
        Thread(Runnable target, String name) 分配新的 Thread 对象。
    实现步骤:
        1.创建一个类实现Runnable接口
        2.重写Runnable接口中的run方法,设置线程任务
        3.创建Runnable接口的实现类对象
        4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        5.调用Thread类中的start方法,开启新的线程,执行run方法

    实现Runnable接口的方式和继承Thread类方式不同
        1.避免单继承的局限性
            一个类继承了Thread类就不能继承其他的类
            一个类实现了Runnable接口,还可以继续继承别的类,实现其他的接口
        2.实现Runnable接口
            把设置线程任务:重写run方法目的就是设置线程任务
            和开启线程:创建Thread类对象,调用start方法开启线程
            进行了解耦,分离,增强了程序的扩展性
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //3.创建Runnable接口的实现类对象
        RunnableImpl r = new RunnableImpl();
        //4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        //Thread t = new Thread(r);//打印20次i
        Thread t = new Thread(new RunnableImpl2());//打印20次HelloWorld
        //5.调用Thread类中的start方法,开启新的线程,执行run方法
        t.start();

        //主线程开启新线程之后继续执行的代码
        for (int i = 0; i <20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
