package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_count
    作用:统计Stream流中元素的个数
    long count();是一个终结方法,返回值不是Stream,不能在使用Stream中的方法了
 */
public class Demo04Stream_count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        long count = stream.count();
        System.out.println(count);//8
    }
}
