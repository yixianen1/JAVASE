package com.demo01.Object;

/*
    Object类中的equals方法
    源码：
        public boolean equals(Object obj) {
            return (this == obj);
        }
        比较两个对象的地址值是否相等
        this：谁调用的方法，方法中的this就是谁
        obj：传进来的参数，数据类型是Object，所以可以传递任意的对象
        ==：
            基本数据类型:比较的是值 1==2 2==1
            引用数据类型：比较的是地址值
        学习目标：
            能够重写Object类的equals方法
            alt+insert-->选择equals and hashCode
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("黄金屋", 20);
        Person p2 = new Person("黄金屋", 20);
//        Person p2 = new Person("颜如玉", 18);
        //Person类继承了Object类，所以可以使用equals方法
        System.out.println(p1);
        System.out.println(p2);

//        p1 = p2;//把p2的地址值赋给p1
        //this(p1)==obj(p2)
        boolean b = p1.equals(p2);
        System.out.println(b);
    }


}
