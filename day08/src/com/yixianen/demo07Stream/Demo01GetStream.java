package com.yixianen.demo07Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。
    获取Stream流的方式:
        1.所有的Collection集合都可以通过stream默认方法获取流
            default Stream<E> stream​() 返回一个序列 Stream与此集合作为其来源。
            注意:此方法都是单列集合Collection中的方法,Map集合不能直接使用
        2.Stream接口的静态方法of可以获取数组对应的流。
            static <T> Stream<T> of​(T... values) : 传递可变参数,把可变参数转换为Stream流
            注意:可变参数底层就是一个数组,所以也可以传递数组,创建Stream流
 */
public class Demo01GetStream {
    public static void main(String[] args) {
        show02();
    }

    /*
        把数组转换为Stream流
     */
    private static void show02() {
        //Stream接口的静态方法of创建Stream流
        Stream<String> stream1 = Stream.of("a", "b", "c", "d", "e");

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);

        //可变参数底层就是一个数组,所以也可以传递数组,创建Stream流
        String[] arr1 = {"a", "b", "c", "d", "e"};
        Stream<String> stream3 = Stream.of(arr1);

        Integer[] arr2 = {1,2,3,4,5};
        Stream<Integer> stream4 = Stream.of(arr2);

        //注意以下写法是错误的,数组的数据类型必须使用包装类,不能使用基本类型
        int[] arr3 = {1,2,3,4,5};
        Stream<int[]> stream5 = Stream.of(arr3);
    }

    /*
        把Collection集合转换为Stream流
     */
    private static void show01() {
        //创建List集合
        List<String> list = new ArrayList<>();
        //使用List集合中的方法stream,把集合转换流
        Stream<String> stream1 = list.stream();

        //创建Set集合
        Set<String> set = new HashSet<>();
        //使用Set集合中的方法stream,把集合转换流
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();

        Set<String> keySet = map.keySet();//获取所有的键
        Stream<String> stream3 = keySet.stream();

        Collection<String> values = map.values();//获取所有的值
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();
    }
}
