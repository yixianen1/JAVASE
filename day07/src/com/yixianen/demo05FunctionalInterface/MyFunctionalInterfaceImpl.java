package com.yixianen.demo05FunctionalInterface;

/*
    创建接口MyFunctionalInterface实现类

    @Override注解:
        检测一个方法是否是重写的方法
 */
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface{
    @Override
    public void method() {
        System.out.println("我是实现类重写的method方法");
    }

    /*@Override
    public void method2() {
        System.out.println("我是实现类重写的method方法");
    }*/
}
