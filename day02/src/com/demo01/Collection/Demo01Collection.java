package com.demo01.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    数组和集合的区别
        数组：
            长度是固定的 new int [3] {1,2,3,4}
            既可以存储基本数据类型， int[]  double[]
            又可以存储引用数据类型 Student[]
        集合:
            长度是可以变化的 add()长度+1  remove()长度-1
            只能存储引用数据类型的数据 ArrayList<Student> ArrayList<Integer> add(new Integer(1))

        ArrayList集合：
            1.有序的集合
            2.可以存储重复的元素
            3.有索引
        LinkedList集合：
            1.有序的集合
            2.可以存储重复的元素
            3.有索引
        HashSet集合：
            1.无序的集合
            2.不能存储重复的元素
            3.没有索引
        LinkedHashSet集合：
            1.有序的集合
            2.不能存储重复的元素
            3.没有索引
        学习目标：
            1.会使用集合存储数据
            2.会遍历集合，取出集合中元素（迭代器，增强for）
            3.知道每种集合的特性
        学习方法：
            学习顶层：学习顶层接口或者抽象类中的共性内容
            使用底层：底层不是接口就是抽象类无法创建对象，需要使用底层
 */
/*
    Collection  常用功能：
        public boolean add(E e) ： 把给定的对象添加到当前集合中 。
        public void clear() :清空集合中所有的元素。
        public boolean remove(E e) : 把给定的对象在当前集合中删除。
        public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象。
        public boolean isEmpty() : 判断当前集合是否为空。
        public int size() : 返回集合中元素的个数。
        public Object[] toArray() : 把集合中的元素，存储到数组中
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，多态
        Collection<String> coll = new ArrayList<>();
//        public boolean add(E e) ： 把给定的对象添加到当前集合中 。
        coll.add("张三");
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);//集合重写了toString方法[张三, 李四, 王五, 赵六, 田七]
        /*
        public boolean remove(E e) : 把给定的对象在当前集合中删除。
        如果集合中有对应的元素，会移除成功，返回true
        如果集合中没有对应的元素，对集合没有影响，返回false
        如果移除的元素在集合中有多个，只会移除第一个
        */
        boolean b1 = coll.remove("张三");//true
        System.out.println(b1);
        boolean b2 = coll.remove("赵四");//false
        System.out.println(b2);
        /*
        public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
        包含：true
        不包含：false
        */
        boolean b3 = coll.contains("王五");
        System.out.println(b3);//true
        System.out.println(b3);//true

        //public int size() : 返回集合中元素的个数。
        System.out.println(coll.size());//5

//        public Object[] toArray() : 把集合中的元素，存储到数组中
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        public boolean isEmpty() : 判断当前集合是否为空。空：true 不为空：false
        boolean empty = coll.isEmpty();
        System.out.println(empty);//false

        /*
        public void clear() :清空集合中所有的元素。
        集合还在，还能继续使用
        */
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true
    }
}
