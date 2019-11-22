package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_skip
    作用:跳过前几个元素,把剩余的元素存储到一个新的Stream流中
    Stream<T> skip(long n);
    例如:
        skip(3):跳过前3个元素
 */
public class Demo06Stream_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //跳过Stream中的前5个元素
        Stream<String> skipStream = stream.skip(5);
        //遍历Stream
        skipStream.forEach(System.out::println);
    }
}
