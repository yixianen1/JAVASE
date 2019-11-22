package com.yixianen.demo01MethodReference;

import java.util.function.Consumer;

/*
    使用函数式接口Consumer消费字符串数据
    注意:
        所有的函数式接口的使用,必须作为方法的参数使用
 */
public class Demo01MethodReference {
    /*
        定义一个方法
            参数传递一个字符串
            参数传递Consumer接口,泛型使用String
     */
    public static void printString(String s, Consumer<String> con){
        //使用Consumer接口中的方法accept对字符串进行消费
        con.accept(s);
    }

    public static void main(String[] args) {
        //调用printString方法,参数Consumer是一个函数式接口,所以可以使用lambda表达式重写accept方法
        printString("HelloWorld",(String s)->{
            System.out.println(s);
        });

        //Lambda表达式省略
        printString("HelloWorld",s->System.out.println(s));

        /*
            方法引用:简化lambda表达式
            Lambda表达式的目的:对字符串进行输出
            System.out对象(PrintStream)已经存在
            println方法也是已经存在
            所以我们可以使用System.out对象引用println方法对字符串进行输出
                System.out::println(省略了参数)
         */
        printString("HelloWorld",System.out::println);
    }
}
