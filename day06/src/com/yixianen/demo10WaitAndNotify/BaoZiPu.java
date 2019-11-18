package com.yixianen.demo10WaitAndNotify;

/*
    包子铺类:是一个线程类
        线程任务: 生产包子
        对包子的状态进行判断
          true:有包子
            包子铺线程调用wait等待
          false:没有包子
            包子铺线程开始生产包子
            生产x皮x陷的包子
            生产包子花费3秒钟
            生产完包子,修改包子的状态为true
            包子铺线程唤醒吃货线程,吃包子
    注意:
        1.生产包子和吃包子,只能有一个在执行,需要使用同步技术
        2.同步技术需要使用锁对象,可以使用包子对象
            在成员位置创建一个包子变量
            使用构造方法为包子变量赋值
 */
//包子铺类:是一个线程类
public class BaoZiPu implements Runnable{
    //在成员位置创建一个包子变量
    BaoZi bz;

    //使用构造方法为包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
        System.out.println("包子铺："+ this.bz);
    }



    //线程任务: 生产包子
    @Override
    public void run() {
        //包子铺一直生产包子
        while (true){
            /*
            1.生产包子和吃包子,只能有一个在执行,需要使用同步技术
            2.同步技术需要使用锁对象,可以使用包子对象
         */
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.flag == true){
                    //true:有包子 包子铺线程调用wait等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            /*
                包子铺被吃货唤醒之后执行的代码
             */
                //false:没有包子 包子铺线程开始生产包子
                //生产x皮x陷的包子
                bz.pi = "薄皮";
                bz.xian = "牛肉大葱陷";
                System.out.println("包子铺正在生产"+bz.pi+bz.xian+"的包子!");
                //生产包子花费3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //生产完包子,修改包子的状态为true
                bz.flag = true;
                //包子铺线程唤醒吃货线程,吃包子
                bz.notify();//唤醒的是bz锁对象上等待的吃货线程
                System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"的包子,吃货赶紧来吃吧!");
            }
        }
    }
}
