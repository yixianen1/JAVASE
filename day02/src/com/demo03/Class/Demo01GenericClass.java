package com.demo03.Class;

public class Demo01GenericClass {
    public static void main(String[] args) {
        //创建GenericClass对象,泛型使用Integer
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setA(1);

        Integer a = gc1.getA();
        System.out.println(a);

        //创建GenericClass对象,泛型使用Boolean
        GenericClass<Boolean> gc2 = new GenericClass<>();
        gc2.setA(true);

        Boolean b2 = gc2.getA();
        System.out.println(b2);
    }
}
