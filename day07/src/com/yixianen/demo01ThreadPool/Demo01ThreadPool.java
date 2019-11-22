package com.yixianen.demo01ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池
    在JDK1.5的时候java提供了线程池
    java.util.concurrent.Executors类:线程池的工厂类,用来生产线程池
    静态方法:
        static ExecutorService newFixedThreadPool(int nThreads)
            创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
        参数:
              int nThreads:创建线程池中线程的个数
        返回值:
            ExecutorService:是生产线程池,类型是一个接口,newFixedThreadPool返回的就是ExecutorService接口的实现类对象
                注意:我们无需关注ExecutorService的实现类是谁,我们只需要会使用ExecutorService接口来接收这个实现类即可(多态)
                    这叫面向接口编程
    java.util.concurrent.ExecutorService:线程池
        Future<?> submit(Runnable task) 提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
            把线程任务传递给submit方法,submit方法会在线程池中获取一个线程用于执行任务;执行完毕会自动把线程在归还给线程池
        Future<T> submit(Callable<T> task) 提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。
        void shutdown()  用于销毁线程池,一般不建议使用
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池工厂类Executors提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService ex = Executors.newFixedThreadPool(2);
        //2.调用线程池ExecutorService中的方法submit,提交线程任务,执行线程任务
        //new Thread(new Runnable(){}).start();
        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程任务1执行了!");//pool-1-thread-2线程任务执行了!
            }
        });

        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程任务2执行了!");//pool-1-thread-1线程任务执行了!
            }
        });

        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程任务3执行了!");//pool-1-thread-2线程任务执行了!
            }
        });

        //void shutdown()  用于销毁线程池,一般不建议使用
        ex.shutdown();

        //线程池销毁之后,就在内存中消失了,就不能在执行线程任务了
        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程任务3执行了!");//RejectedExecutionException
            }
        });
    }

}

















