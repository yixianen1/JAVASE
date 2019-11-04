package com.demo01.Object;

import java.util.Objects;

//student extents Person extends Object 间接继承
public class Person extends Object {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * 直接打印对象的的地址值没有意义，需要重写Object类的toString方法
     * 打印对象的属性（name,age）
     * */
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
    /*
     * 比较两个对象的地址值没有意义，需要重写Object类的equals方法
     * 比较两个对象的属性（name，age）
     * */

    @Override
    public boolean equals(Object o) {
        //为了提高传递效率，传递的参数o如果就是this，直接返回true
        if (this == o) return true;
        //参数o是null或者o不是Person类型，直接返回false
        //getClass() != o.getClass()等价于if(o instanceof Person)防止类型转换异常
        if (o == null || getClass() != o.getClass()) return false;
        /*
        * this = p1 = new Person("黄金屋", 20);
        * Object o = p2 = new Person("颜如玉", 18);多态
        * 多态的弊端：无法使用子类特有的成员（变量，方法）
        * */
        //向下转型
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
