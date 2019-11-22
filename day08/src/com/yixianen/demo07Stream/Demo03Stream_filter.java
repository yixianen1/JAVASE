package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_filter
    作用:对Stream流中的元素进行过滤,形成一个新的Stream流
    Stream<T> filter(Predicate<? super T> predicate);
        Predicate接口中的抽象方法boolean test(T t);
    filter方法的参数是一个函数式接口Predicate,所以可以使用Lambda表达式重写test方法
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //对Stream流中的元素进行过滤,只要包含"羊羊"的元素
        /*Stream<String> streamYY = stream.filter((String s) -> {
            return s.contains("羊羊");
        });*/

        //简化lambda
        Stream<String> streamYY = stream.filter(s -> s.contains("羊羊"));

        //遍历Stream
        streamYY.forEach(System.out::println);
    }
}
