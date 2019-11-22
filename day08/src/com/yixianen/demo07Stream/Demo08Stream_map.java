package com.yixianen.demo07Stream;

import java.util.stream.Stream;

/*
    使用Stream流中的方法map,把String类型的姓名映射为Person类型的对象
 */
public class Demo08Stream_map {
    public static void main(String[] args) {
        //创建一个存储String的Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七", "王八");
       /* Stream<Person> personStream = stream.map((String name) -> {
            return new Person(name);
        });*/

        //简化Lambda
        //Stream<Person> personStream = stream.map(name -> new Person(name));

        //方法引用
        Stream<Person> personStream = stream.map(Person::new);

        //遍历Stream
        personStream.forEach(System.out::println);
    }
}
