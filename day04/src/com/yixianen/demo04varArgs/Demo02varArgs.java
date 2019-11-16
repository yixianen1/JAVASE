package com.yixianen.demo04varArgs;

/*
    可变参数的注意事项
 */
public class Demo02varArgs {
    public static void main(String[] args) {
        method(1,2,3,8.8,"ss",'a');
    }

    //1.一个参数列表中,只能包含一个可变参数
    //public static void method(int...a,String...b){}

    //2.参数列表中有多个参数,可变参数需要写在末尾
    //public static void method(int a,String s,double d,String...arr){}

    //可变参数的终极写法
    public static void method(Object...o){}
}
