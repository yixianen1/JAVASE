package com.yixianen.demo03Exception;

/*
    异常注意事项:
        运行时异常被抛出可以不处理。即不捕获也不声明抛出。交给JVM处理(中断)
        运行期异常没有必要处理,一般修改修改代码,让程序不在抛出运行期异常
 */
public class Demo02Exception {
    public static void main(String[] args) {
        try {
            //System.out.println(0/0);
            System.out.println(0/1);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
