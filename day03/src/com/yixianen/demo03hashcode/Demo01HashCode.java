package com.yixianen.demo03hashcode;

/*
   哈希值:就是一个十进制的整数,由操作系统随机给出
        对象的地址值,就是使用的哈希值,由JVM模拟出来的一个地址,不是对象的实际物理地址
   在Object类有一个方法叫hashCode,可以获取对象的哈希值
        int hashCode() 返回该对象的哈希码值。
   hashCode方法的源码:
        public native int hashCode();
        native:指的是调用系统的方法
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();
        //Person类默认继承了Object,所以可以使用hashCode方法
        int h1 = p1.hashCode();
        System.out.println(h1);//1967205423-->1

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//42121758-->1

        //toString方法,获取对象的地址值
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(p1.toString());//@75412c2f-->1
        System.out.println(p2.toString());//@282ba1e-->1
        System.out.println(p1==p2);//false
    }
}
