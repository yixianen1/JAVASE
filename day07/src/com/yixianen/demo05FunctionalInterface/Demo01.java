package com.yixianen.demo05FunctionalInterface;

/*
    函数式接口的使用:
        一般都是作为方法的参数使用show方法
 */
public class Demo01 {
    public static void main(String[] args) {
        //调用show方法,参数是一个接口,所以可以传递接口的实现类
        show(new MyFunctionalInterfaceImpl());

        //调用show方法,参数是一个接口,所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("我是匿名内部类重写的method方法");
            }
        });

        //调用show方法,参数是一个接口,接口是一个函数式接口,所以可以使用Lambda表达式
        show(()->{
            System.out.println("我是Lambda表达式重写的method方法");
        });

        show(()->System.out.println("我是Lambda表达式重写的method方法"));
    }

    /*
        定义一个方法,参数传递函数式接口MyFunctionalInterface
     */
    public static void show(MyFunctionalInterface mfi){
        mfi.method();
    }
}
