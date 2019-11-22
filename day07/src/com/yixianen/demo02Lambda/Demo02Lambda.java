package com.yixianen.demo02Lambda;

/*
    Lambda表达式的标准格式:
        (参数)->{重写的方法体}
        一些参数,一个箭头,一段代码

        ():接口中的抽象方法的参数,有就写上,没有空着   (String s) (int a,int b)
        ->传递:把参数传递给{}中的方法体
        {}:重写接口中的抽象方法的方法体

 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式,实现多线程程序
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->执行了线程任务");
            }
        }).start();

        //使用lambda表达式实现多线程程序
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"-->执行了线程任务");
        }).start();

        //使用Lambda的省略格式
        new Thread(()->System.out.println(Thread.currentThread().getName()+"-->执行了线程任务")).start();
    }
}
