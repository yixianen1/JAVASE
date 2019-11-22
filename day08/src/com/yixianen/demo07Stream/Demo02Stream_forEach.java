package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_forEach
    作用:对Stream流进行遍历
    void forEach(Consumer<? super T> action);是一个终结方法,返回值不是Stream,不能在使用Stream中的方法了
        Consumer接口中的抽象方法void accept(T t);
    forEach方法的参数是一个函数式接口Consumer,所以可以使用Lambda表达式重写accept方法
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用forEach方法遍历Stream流
        /*stream.forEach((String s)->{
            System.out.println(s);
        });*/

        //简化Lambda
        /*
            IllegalStateException: stream has already been operated upon or closed
            第二次使用Stream中的方法forEach抛出了:非法的状态异常
            流是一个流式模式,流使用完毕之后,数据就流转到下一步去了,这时上一步的流就已经关闭了
            所以就不能在使用了,Stream流只能使用一次
         */
        //stream.forEach(s-> System.out.println(s));

        //使用方法引用简化Lambda
        stream.forEach(System.out::println);
    }
}
