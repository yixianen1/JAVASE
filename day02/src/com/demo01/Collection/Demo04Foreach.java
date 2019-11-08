package com.demo01.Collection;

import java.util.ArrayList;

/*
    增强for循环
    是JDK1.5之后出现的新特性，使用for循环的格式简化了迭代器的代码
    作用：以后的学习和工作中，只要是遍历，都用增强for
        1.可以遍历数组
        2.可以遍历集合
    格式：
        for(集合/数组中元素的数据类型 变量名:集合名字/数组名字){
        sout(变量名);
        }
 */
public class Demo04Foreach {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
//        show04();
        show05();
    }

    /*
            使用增强for循环遍历集合
         */
    private static void show05() {
        /*
            学习目标：能够使用集合存储自定义类型
         */
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("貂蝉", 18));
        list.add(new Person("西施", 18));
        list.add(new Person("王昭君", 18));
        list.add(new Person("杨玉环", 18));
        for (Person p : list) {
            System.out.println(p);
        }
    }

    /*
        使用增强for循环遍历集合
     */
    private static void show04() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(4);
//        for (int i : list) {//自动拆箱
//            System.out.println(i);
//        }
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    /*
        增强for循环遍历的同时，可以使用元素特有的方法
     */
    private static void show03() {
        String[] arr = {"aaa", "24121", "dadafa"};
        for (String s : arr) {
            System.out.println(s + "---->" + s.length());
        }

    }

    /*
        增强for循环和普通for循环的区别
        普通for：在遍历的过程中可以对数组/集合中元素进行修改（索引）
        增强for:没有索引，也不能修改数组/集合中的元素
     */
    private static void show02() {
        int[] arr1 = {1, 2, 3};
        //使用普通的for循环遍历数组
        for (int i = 0; i < arr1.length; i++) {
            //把数组中的元素扩大二倍
            arr1[i] *= 2;
            System.out.println(arr1[i]);
        }
        System.out.println("arr1[0]" + arr1[0]);
        System.out.println("-----------");
//            使用增强for循环遍历数组
        int[] arr2 = {1, 2, 3};
        for (int i : arr2) {
            //把数组中的元素扩大二倍(其实是改变的变量i的值)
            i *= 2;
            System.out.println(i);
        }
        System.out.println("arr2[0]" + arr2[0]);

    }

    /*
        使用增强for循环遍历数组
     */
    private static void show01() {
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
