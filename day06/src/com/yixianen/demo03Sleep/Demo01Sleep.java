package com.yixianen.demo03Sleep;

/*
    Thread类中的方法:
        static void sleep(long millis)
          在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），睡醒了,继续执行
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        //秒表
        for (int i = 1; i <=60; i++) {
            System.out.println(i);

            /*
                让程序睡眠1秒钟   1秒=1000毫秒
             */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
