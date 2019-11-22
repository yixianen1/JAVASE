package com.yixianen.demo01ThreadPool;

import java.util.Random;
import java.util.concurrent.*;

/*
    Future<T> submit(Callable<T> task) 提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。
    java.util.concurrent.Callable<T>接口:用于设置线程任务
        抽象方法：
         V call() 返回一个和接口类型相同的值，计算结果，如果无法计算结果，则抛出一个异常。
         重写call方法,返回一个执行泛型类型的数据
 */
public class Demo02ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.使用线程池工厂类Executors提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService ex = Executors.newFixedThreadPool(2);
        //2.调用线程池ExecutorService中的方法submit,传递线程任务,执行线程任务,接收线程任务的返回值
        Future<Double> f1 = ex.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return 1.1;
            }
        });
        System.out.println(f1);//java.util.concurrent.FutureTask@7006c658

        //使用Future接口中的方法V get()获取线程任务的返回值
        Double d = f1.get();
        System.out.println(d);


        Future<Integer> f2 = ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //返回一个0-100之间的随机数 [0,100)
                return new Random().nextInt(100);
            }
        });

        System.out.println(f2.get());

    }
}
