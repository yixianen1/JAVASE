package com.yixianen.demo04collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("迪丽热巴",18));
        list.add(new Person("古力娜扎",17));
        list.add(new Person("赵丽颖",19));
        list.add(new Person("柳岩",30));
        System.out.println(list);//[Person{name='迪丽热巴', age=18}, Person{name='古力娜扎', age=17}, Person{name='赵丽颖', age=19}, Person{name='柳岩', age=30}]

        //使用Collections中的sort方法,对Person进行排序,按照年龄的降序排序
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(list);//[Person{name='柳岩', age=30}, Person{name='赵丽颖', age=19}, Person{name='迪丽热巴', age=18}, Person{name='古力娜扎', age=17}]
    }
}
