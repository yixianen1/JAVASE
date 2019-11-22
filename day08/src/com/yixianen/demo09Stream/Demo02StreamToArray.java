package com.yixianen.demo09Stream;

import java.util.stream.Stream;

/*
    收集Stream结果_收集到数组中
    使用Stream流中的方法toArray
    Object[] toArray();
 */
public class Demo02StreamToArray {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用Stream流中的方法toArray
        Object[] arr = stream.toArray();
        //遍历数组
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
