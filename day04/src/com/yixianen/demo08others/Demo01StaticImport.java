package com.yixianen.demo08others;

/*
 * JDK1.5新特性,静态导入
 * 减少开发的代码量
 * 标准写法,导入包的时候才能使用
 * import static java.lang.System.out; 最末尾,必须是一个静态成员
 */

import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Collections.sort;

public class Demo01StaticImport {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        out.println(1);
        out.println(1);
        out.println(1);
        out.println(1);
        out.println(1);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        sort(list);
        System.out.println(list);
    }
}
