package com.yixianen.demo06payTicket;

/*
    卖票案例
 */
public class RunnableImpl implements Runnable{
    //定义共享的票源
    private int ticket = 100;

    //线程任务:卖票
    @Override
    public void run() {
        //增加一个死循环,让卖票重复执行
        while (true){
            //增加一个判断,票大于0
            if(ticket>0){
                /*
                    为了提高线程安全问题出现的几率
                    让线程睡眠10毫秒,放弃cpu的执行权
                 */
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
