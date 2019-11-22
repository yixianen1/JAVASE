package com.yixianen.demo05FunctionalInterface;

/*
    函数式接口:
        有且仅有一个抽象方法的接口
    注解:
        @FunctionalInterface:检测一个接口是否为函数式接口
            是:接口中只能一个抽象方法
            不是:接口中没有抽象方法,抽象方法的个数多于一个

 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}
