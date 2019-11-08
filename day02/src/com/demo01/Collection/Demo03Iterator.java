package com.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/*
    并发修改异常：在使用迭代器遍历集合的过程中，对集合的长度进行了修改（增加元素，删除元素）
        并发：遍历和修改同时进行
        ConcurrentModificationException

    解决方案：
        1.迭代就是迭代，不要对集合进行修改
        2.想要在遍历的过程中，可以使用Iterator接口的子接口ListIterator
        public interface ListIterator<E>extends Iterator<E>
        里边定义了往集合中添加元素和删除元素的方法
            void add(E e)将指定的元素插入列表（可选操作）。
           void remove()从列表中移除由 next 或 previous 返回的最后一个元素（可选操作）。
           可以使用迭代器的add/remove方法对集合进行修改，就相当于迭代器和集合已经商量好了，可以增加元素

       注意：
            ListIterator接口只能List接口下边的集合
 */
public class Demo03Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("姚明");
        list.add("詹姆斯");
        list.add("科比");
        list.add("库里");
        list.add("艾弗森");
        //使用集合中的方法iterator获取迭代器
        Iterator<String> it = list.iterator();
        //使用迭代中的方法hasNext和next依次取出集合中的元素
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

            /*
                增加一个判断，如果存在科比
                增加一个奥尼尔
             */
//            if (s.equals("科比")){
//                list.add("奥尼尔");
//            }
//            list.remove(s);
        }
        System.out.println("-------------");
        ListIterator<String> lit = list.listIterator();
        //使用迭代中的方法hasNext和next依次取出集合中的元素
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);

            /*
                增加一个判断，如果存在科比
                增加一个奥尼尔
             */
            if (s.equals("科比")){
                lit.add("奥尼尔");//使用的迭代器增加元素的方法
            }
        }
        System.out.println(list);//[姚明, 詹姆斯, 科比, 奥尼尔, 库里, 艾弗森]


    }
}
