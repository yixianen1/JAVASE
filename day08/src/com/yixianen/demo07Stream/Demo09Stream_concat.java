package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_concat
    作用:把两个Stream进行合并为一个
    static <T> Stream<T> concat(Stream<T> a, Stream<T> b)
 */
public class Demo09Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "王八");
        Stream<String> stream2 = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用Stream中的静态方法concat把两个流合并为一个新的流
        Stream<String> stream = Stream.concat(stream1, stream2);
        //遍历Stream流
        stream.forEach(System.out::println);

    }
}
