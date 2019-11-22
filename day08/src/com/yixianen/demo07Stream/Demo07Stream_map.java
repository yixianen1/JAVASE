package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_map
    作用:映射,把Stream流数据类型转换为另外一种数据类型的Stream流
    <R> Stream<R> map(Function<T,R> mapper);
        Function接口中的抽象方法R apply(T t);
    map方法的参数是一个函数式接口Function,所以可以使用Lambda表达式重写apply方法
 */
public class Demo07Stream_map {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> streamString = Stream.of("1", "2", "3", "4", "5");
        //使用map方法把String类型的Stream映射为Integer类型的Stream
        /*Stream<Integer> streamInteger = streamString.map((String s) -> {
            return Integer.parseInt(s);
        });*/

        //简化Lambda
        //Stream<Integer> streamInteger = streamString.map(s -> Integer.parseInt(s));
        
        //方法引用
        Stream<Integer> streamInteger = streamString.map(Integer::parseInt);

        //遍历Stream
        streamInteger.forEach(System.out::println);
    }
}
