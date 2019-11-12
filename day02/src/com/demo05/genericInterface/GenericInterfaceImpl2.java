package com.demo05.genericInterface;

/*
    定义含有泛型接口GenericInterface实现类
    第二种使用方式:
        类实现含有泛型的接口,接口使用什么类型,类就使用什么类型
        类跟着接口走,就相当于定义了一个含有泛型的类
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void show(I i) {
        System.out.println(i);
    }
}
