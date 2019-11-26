package com.yixianen.demo08Test;

import java.util.ArrayList;
import java.util.List;

/*
    Stream综合案例_使用传统方式完成(不使用Stream流)
    现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以
    1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
    2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
    3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中
    4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
    5. 将两个队伍合并为一个队伍；存储到一个新集合中
    6. 根据姓名创建Person对象；存储到一个新集合中
    7. 打印整个队伍的Person对象信息。
 */
public class Demo01Test {
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
        List<String> one1 = new ArrayList<>();
        for (String name : one) {
            if (name.length() == 3) {
                one1.add(name);
            }
        }
        System.out.println(one1);//[宋远桥, 苏星河, 洪七公, 欧阳锋]
        //2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
        List<String> one2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) { //i=0,1,2
            one2.add(one1.get(i));
        }
        System.out.println(one2);//[宋远桥, 苏星河, 洪七公]


        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
        //3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中
        List<String> two1 = new ArrayList<>();
        for (String name : two) {
            if (name.startsWith("张")) {
                two1.add(name);
            }
        }
        System.out.println(two1);//[张无忌, 张三丰, 张二狗, 张天爱, 张三]
        //4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
        List<String> two2 = new ArrayList<>();
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }
        System.out.println(two2);//[张二狗, 张天爱, 张三]

        //5. 将两个队伍合并为一个队伍；存储到一个新集合中
        List<String> all = new ArrayList<>();
        //boolean addAll​(Collection<? extends E> c)把一个集合中所有元素,添加到一个集合中
        all.addAll(one2);
        all.addAll(two2);
        System.out.println(all);//[宋远桥, 苏星河, 洪七公, 张二狗, 张天爱, 张三]

        //6. 根据姓名创建Person对象；存储到一个新集合中
        List<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        //7. 打印整个队伍的Person对象信息。
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
