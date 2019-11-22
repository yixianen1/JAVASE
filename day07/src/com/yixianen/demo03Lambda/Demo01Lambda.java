package com.yixianen.demo03Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
    创建一个数组,类型使用Person
    存储Person对象
    使用Arrays数组工具类中的方法sort对Person按照年龄进行降序排序

    java.util.Arrays:
        static <T> void sort(T[] a, Comparator<? super T> c)
          根据指定比较器产生的顺序对指定对象数组进行排序。
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //创建一个数组,类型使用Person.存储Person对象
        Person[] arr = {
                new Person("迪丽热巴",18),
                new Person("古力娜扎",17),
                new Person("马尔扎哈",30),
        };
        //使用Arrays数组工具类中的方法sort对象Person按照年龄进行降序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // o1-o2升序,o2-o1降序
                return o2.getAge()-o1.getAge();
            }

        });

        //使用Lambda表达式,简化匿名Comparator内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o2.getAge()-o1.getAge();
        });

        //使用Lambda表达式的简化格式
        Arrays.sort(arr,(o1,o2)->o2.getAge()-o1.getAge());

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
