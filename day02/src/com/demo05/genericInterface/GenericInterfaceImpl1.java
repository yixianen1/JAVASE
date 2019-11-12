package com.demo05.genericInterface;

/*
    定义含有泛型接口GenericInterface实现类
    第一种使用方式:
        类实现接口的同时,指定接口泛型的数据类型,这样数据类型就确定下来了
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
