package com.yixianen.demo04Lambda;

import java.util.ArrayList;

/*
    Lambda表达式的使用前提:
        1.必须用来简化接口重写的匿名内部类
        2.接口中只能有一个抽象方法(函数式接口),才能使用Lambda表达式简化
        Lambda表达式是可推导,可省略
        接口中只有一个抽象方法,所以Lambda重写的就是这个抽象方法
    Lambda表达式的省略格式:
        ():()中的参数,数据类型是可以省略的   (int a,int b)-->(a,b)
            Lambda重写的就是这个抽象方法,抽象方法的参数的类型是固定的,所以可以推导出来,就可以省略了
        ():()中如果只有一个参数,那么类型和()都可以省略 (int a)-->a
            注意:如果没有参数()不能省略
        {}:{}中的方法体,无论是否有返回值,如果只有一行代码
           那么{},return,;都可以省略,但是必须3个一起省略
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //创建集合对象,必须指定集合的泛型,在JDK1.7之前集合前后的泛型都必须写出来
        ArrayList<String> list01 = new ArrayList<String>();

        //在JDK1.7之后,后边的泛型可以根据前边的泛型推导出来,所以可以省略
        ArrayList<String> list02 = new ArrayList<>();
    }
}
