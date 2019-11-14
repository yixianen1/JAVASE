package com.yixianen.demo01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List<E>接口 extends Collection<E>接口
    List接口的特点:
        1.是一个有序的集合,存储元素和取出元素顺序是一致的 存储:123 取出:123
        2.有索引,包含了一些带索引的特有方法
        3.允许存储重复的元素

    带索引的方法:
        void add(int index, E element)  在指定的索引处添加一个新元素
        E get(int index)  获取指定索引处的元素
        E remove(int index)  移除并返回指定索引处的元素
        E set(int index, E element)  把指定索引处的元素,替换为新的元素;返回被替换的元素
    注意:
        使用带索引的方法,一定不要超出索引的使用范围,否则就会抛出索引越界异常
    总结:
        IndexOutOfBoundsException: 索引越界异常,一般集合和抛出
            ArrayIndexOutOfBoundsException: 数组索引越界异常
            StringIndexOutOfBoundsException: 字符串索引越界异常
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //创建一个List集合对象
        List<String> list = new ArrayList<>();
        //往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//[a, b, c, d, a]

        //void add(int index, E element)  在指定的索引处添加一个新元素
        //在c和d之间添加w
        list.add(3,"w");
        System.out.println(list);//[a, b, c, w, d, a]

        //E get(int index)  获取指定索引处的元素
        System.out.println(list.get(0));//a
        System.out.println(list.get(4));//d

        //E remove(int index)  移除并返回指定索引处的元素
        //把d后边的a删除
        String s1 = list.remove(5);
        System.out.println("被移除的元素:"+s1);//a
        System.out.println(list);//[a, b, c, w, d]

        //E set(int index, E element)  把指定索引处的元素,替换为新的元素;返回被替换的元素
        //把w替换为小美女
        String s2 = list.set(3, "小美女");
        System.out.println("被替换的元素:"+s2);//w
        System.out.println(list);//[a, b, c, 小美女, d]

        //System.out.println(list.get(100));//IndexOutOfBoundsException: Index 100 out-of-bounds for length 5
        System.out.println("------------------------------");
        //List接口中的集合,有3种遍历方式
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");
        //使用迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //使用增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}


















