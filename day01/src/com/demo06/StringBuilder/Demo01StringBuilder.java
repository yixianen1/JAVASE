package com.demo06.StringBuilder;

/*
    java.lang.StringBuilder的构造方法：
        public StringBuilder() ：构造一个空的StringBuilder容器。
        public StringBuilder(String str) ：构造一个StringBuilder容器，并将字符串添加进去
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1：" + bu1);//bu1:底层的数组中没有内容

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2：" + bu2);//bu2:abc底层的数组 中存储字符串abc

        /*
            int length() 返回StringBuilder中字符个数
         */
        System.out.println(bu1.length());
        System.out.println(bu2.length());

        /*
            int copcity()
            返回当前容量
         */
        System.out.println(bu1.capacity());
        System.out.println(bu2.capacity());
    }
}
