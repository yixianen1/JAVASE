package com.yixianen.demo10WaitAndNotify;

/*
    等待与唤醒案例:
        Object类中的方法:
             void wait()
                在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
                被唤醒的线程,会执行wait方法之后的代码
             void notify() 唤醒在此对象监视器(对象锁)上等待的单个线程。
        注意:
            1.wait和notify方法必须由锁对象调用,而且必须是同一个锁
                锁对象-->wait()  锁对象-->notify()
            2.wait和notify方法一般都是写在同步中

     测试类:
        创建一个包子对象
        创建一个包子铺线程,生产包子
        创建一个吃货线程,吃包子

        包子铺正在生产薄皮牛肉大葱陷的包子!
        包子铺已经生产好了薄皮牛肉大葱陷的包子,吃货赶紧来吃吧!
        吃货正在吃薄皮牛肉大葱陷的包子!
        吃货已经吃完了薄皮牛肉大葱陷的包子,包子铺赶紧生产包子吧!
        ------------------------------------------------------------
        包子铺正在生产薄皮牛肉大葱陷的包子!
        包子铺已经生产好了薄皮牛肉大葱陷的包子,吃货赶紧来吃吧!
        吃货正在吃薄皮牛肉大葱陷的包子!
        吃货已经吃完了薄皮牛肉大葱陷的包子,包子铺赶紧生产包子吧!
        ------------------------------------------------------------
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建一个包子对象(锁对象)
        BaoZi bz = new BaoZi();
        System.out.println(bz);
        //创建一个包子铺线程,生产包子
        new Thread(new BaoZiPu(bz)).start();
        //创建一个吃货线程,吃包子
        new Thread(new ChiHuo(bz)).start();
    }
}
