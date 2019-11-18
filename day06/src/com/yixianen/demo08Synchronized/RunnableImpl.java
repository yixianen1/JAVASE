package com.yixianen.demo08Synchronized;

/*
    卖票案例出现了线程安全问题:票出现的重复的票和不存在的票
    解决线程安全问题的第二种方式:使用同步方法

    使用步骤:
        1.创建一个方法,方法的修饰符添加上synchronized
        2.把访问了共享数据的代码放入到方法中
        3.调用同步方法

    格式:
        修饰符 synchronized 返回值类型 方法名(参数列表){
            出现安全问题的代码(访问了共享数据的代码)
        }
 */
public class RunnableImpl implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        System.out.println("this:"+this);//this:com.itheima.demo08.Synchronized.RunnableImpl@58ceff1
        while (true){
            //3.调用同步方法
            payTicketStatic();
        }
    }

    /*
        静态的同步方法(了解)
        锁对象是谁?是this吗?不是,this是创建对象之后才会产生了
        静态优先于对象加载到内存中
        锁对象是本类的class文件对象(反射)
        RunnableImpl.class-->唯一
     */
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl.class){
            //2.把访问了共享数据的代码放入到方法中
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //卖票操作,ticket--
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票!");
                ticket--;
            }
        }
    }

    /*
        定义一个方法
        1.创建一个方法,方法的修饰符添加上synchronized

        同步方法的锁对象就是this
        本类的对象 new RunnableImpl();
     */
    public /*synchronized*/ void payTicket(){
        synchronized (this){
            //2.把访问了共享数据的代码放入到方法中
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //卖票操作,ticket--
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票!");
                ticket--;
            }
        }
    }
}
