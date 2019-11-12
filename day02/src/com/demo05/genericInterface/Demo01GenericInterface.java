package com.demo05.genericInterface;

public class Demo01GenericInterface {
    public static void main(String[] args) {
        //创建含有泛型接口GenericInterface的实现类GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.show("aaa");

        //创建含有泛型接口GenericInterface的实现类GenericInterfaceImpl2对象
        //在创建对象的同时,指定泛型的类型
        GenericInterfaceImpl2<Double> gi2 = new GenericInterfaceImpl2();
        gi2.show(8.8);

        GenericInterfaceImpl2<Integer> gi3 = new GenericInterfaceImpl2();
        gi3.show(1);

    }
}
