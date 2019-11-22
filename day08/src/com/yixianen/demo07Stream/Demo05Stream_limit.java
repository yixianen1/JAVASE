package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_limit
    作用:获取前几个元素,把元素存储到一个新的Stream流中
    Stream<T> limit(long maxSize);
    例如:
        limit(3)获取流中前3个元素
        limit(n)获取流中前n个元素
 */
public class Demo05Stream_limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //获取Stream流中的前5个元素
        Stream<String> limitStream = stream.limit(5);
        //遍历Stream
        limitStream.forEach(System.out::println);
    }
}
