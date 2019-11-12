package com.demo03.Class;

/*
    泛型的定义格式:<名称>

    定义一个含有泛型的类:模拟ArrayList集合
    什么时候使用泛型:当我们不知道使用什么类型时,使用泛型
    泛型:代表未知的数据类型
    什么时候确定泛型的数据类型:创建对象的时候

 */
public class GenericClass<C> {
    private C a;

    public C getA() {
        return a;
    }

    public void setA(C a) {
        this.a = a;
    }
}
