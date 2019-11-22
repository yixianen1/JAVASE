package com.yixianen.demo01ThreadPool;

import java.util.Scanner;
import java.util.concurrent.*;

/*
    使用Callable接口,计算1-100或者1-200之间所有整数的和
 */
public class Demo03Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.使用线程池工厂类Executors提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService ex = Executors.newFixedThreadPool(2);

        //使用Scanner获取一个整数
        System.out.println("请输入一个整数");
        int i = new Scanner(System.in).nextInt();

        //2.调用线程池ExecutorService中的方法submit,传递线程任务,执行线程任务,接收线程任务的返回值
        Future<Integer> f = ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                //计算1-i之间的和
                for (int j = 1; j <= i; j++) {
                    sum += j;
                }
                return sum;
            }
        });
        System.out.println(f.get());
    }
}
