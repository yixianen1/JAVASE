package com.yixianen.demo03hashcode;

/*
    String类重写了Object类的hashCode方法
        相同的字符串,返回的哈希值一样的
 */
public class Demo02StringHashCode {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

        System.out.println('重'+0);//37325
        System.out.println('地'+0);//22320
        System.out.println('通'+0);//36890
        System.out.println('话'+0);//35805
    }
}
