package com.yixianen.demo02SetThreadName;

/*
    设置线程的名称:
        1.可以使用Thread类中的方法setName
            void setName(String name) 改变线程名称，使之与参数 name 相同。
        2.添加一个带参构造方法,参数传递线程的名称;调用父类的带参构造方法,把名字传递给父类,让父亲给儿子起名字
            Thread(String name) 分配新的 Thread 对象。
 */
public class MyThread extends Thread{

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
