package com.yixianen.demo01list;

import java.util.LinkedList;

/*
    java.util.LinkedList<E>集合 implements List<E>接口
    LinkedList的特点:
        底层是一个双向链表结构:查询慢,增删快
    LinkedList集合中包含了一些操作首尾元素的特有方法
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void push(E e):将元素推入此列表所表示的堆栈。
        - public void addLast(E e):将指定元素添加到此列表的结尾。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。
    注意:
        我们使用LinkedList集合特有的方法,不能使用多态

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法等效于 removeFirst()。
        - public E removeLast():移除并返回此列表的最后一个元素。
     */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");
        System.out.println(linked);//[aaa, bbb, ccc, ddd]

        //linked.clear();

        //String first = linked.removeFirst();
        String first = linked.pop();
        System.out.println(first);//aaa

        String last = linked.removeLast();
        System.out.println(last);//ddd

        System.out.println(linked);//[bbb, ccc]
    }

    /*
         - public E getFirst():返回此列表的第一个元素。
         - public E getLast():返回此列表的最后一个元素。
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");

        //linked.clear();//清空集合

        //防止程序抛出NoSuchElementException没有元素异常,增加一个判断
        if(!linked.isEmpty()){//size() == 0;
            String first = linked.getFirst();
            System.out.println(first);//aaa

            String last = linked.getLast();
            System.out.println(last);//ddd

        }

        if(linked.size()!=0){
            String first = linked.getFirst();
            System.out.println(first);//aaa

            String last = linked.getLast();
            System.out.println(last);//ddd

        }
    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
        - public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于add()
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        linked.add("ddd");
        linked.add("aaa");
        System.out.println(linked);//[aaa, bbb, ccc, ddd, aaa]

        //public void addFirst(E e):将指定元素插入此列表的开头。
        //linked.addFirst("www");//等同于push()，一般使用addFirst()
        linked.push("www");
        System.out.println(linked);//[www, aaa, bbb, ccc, ddd, aaa]

        //public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于add()
        //linked.addLast("com");
        linked.add("com");
        System.out.println(linked);//[www, aaa, bbb, ccc, ddd, aaa, com]
    }
}
























