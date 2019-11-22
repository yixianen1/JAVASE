package com.yixianen.demo08Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream综合案例_使用Stream流
    现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以
    1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
    2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
    3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中
    4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
    5. 将两个队伍合并为一个队伍；存储到一个新集合中
    6. 根据姓名创建Person对象；存储到一个新集合中
    7. 打印整个队伍的Person对象信息。
 */
public class Demo02Test {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        one.add("欧阳锋");
        //1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        //2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
        //把集合转换为Stream流
        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);


        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
        //3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中
        //4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
        //把集合转换为Stream流
        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);

        //5. 将两个队伍合并为一个队伍；存储到一个新集合中
        //6. 根据姓名创建Person对象；存储到一个新集合中
        //7. 打印整个队伍的Person对象信息。
        //Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(System.out::println);
        Stream.concat(oneStream,twoStream).map(Person::new).forEach(System.out::println);
    }
}
