package com.demo04.genericMethod;

public class Demo01GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();

        //调用含有泛型的show方法
        gm.show(1);//泛型就是Integer类型
        gm.show("abc");//泛型就是String类型
        gm.show(true);//泛型就是Boolean类型
        gm.show(8.8);//泛型就是Double类型
        gm.show('a');//泛型就是Characher类型

        //通过类名直接调用静态方法
        GenericMethod.method(1);
        GenericMethod.method("abc");
    }
}
