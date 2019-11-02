package com.demo01.object;
/*
     Objects类里面的方法都是静态方法，避免空指针异常
     Objects类中的equals方法
     public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
 */
import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
//        String s1 = "abc";
        String s1 = null;//null能调用方法吗？不能 会抛出空指针异常
        String s2 = "aaa";
        //比较两个字符串的内容是否相同
//        boolean b1 = s1.equals(s2);
        //Objects中的equals方法
        boolean b2 = Objects.equals(s1, s2);

        System.out.println(b2);
    }
}
