package com.demo06.StringBuilder;

/*
    String和StringBuilder可以相互转换
        String-->StringBuilder
            使用带参构造方法：
                public StringBuilder(String str)
        StringBuilder-->String
            使用成员方法toString:
                String toString()
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
//        String-->StringBuilder
        String s = "hello";
        StringBuilder bu = new StringBuilder(s);
        bu.reverse();//把StringBuilder中的内容反转
        System.out.println(bu);//olleh
//        StringBuilder-->String
        s = bu.toString();
        System.out.println(s);//olleh
    }
}
