package com.yixianen.demo10WaitAndNotify;

/*
    吃货类:是一个线程类
        线程任务:吃包子
        对包子的状态进行判断
           false:没有包子
             吃货线程调用wait等待
           true:有包子
            吃货线程开始吃包子
            打印吃x皮x陷的包子
            吃完包子,修改包子的状态为false
            吃货线程唤醒包子铺线程,做包子
     注意:
        1.生产包子和吃包子,只能有一个在执行,需要使用同步技术
        2.同步技术需要使用锁对象,可以使用包子对象
            在成员位置创建一个包子变量
            使用构造方法为包子变量赋值
 */
//吃货类:是一个线程类
public class ChiHuo implements Runnable{
    //在成员位置创建一个包子变量
    BaoZi bz;

    //使用构造方法为包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
        System.out.println("吃货："+ this.bz);
    }

    //线程任务:吃包子
    @Override
    public void run() {
        //吃货一直吃包子
        while(true){
            /*
            1.生产包子和吃包子,只能有一个在执行,需要使用同步技术
            2.同步技术需要使用锁对象,可以使用包子对象
         */
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.flag==false){
                    //false:没有包子 吃货线程调用wait等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            /*
                吃货线程被包子铺线程唤醒之后执行的代码
             */
                //true:有包子 吃货线程开始吃包子
                //打印吃x皮x陷的包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子!");
                //吃完包子,修改包子的状态为false
                bz.flag = false;
                //吃货线程唤醒包子铺线程,做包子
                bz.notify();//唤醒bz对象上等待的包子铺线程
                System.out.println("吃货已经吃完了"+bz.pi+bz.xian+"的包子,包子铺赶紧生产包子吧!");
                System.out.println("------------------------------------------------------------");
            }
        }
    }
}
