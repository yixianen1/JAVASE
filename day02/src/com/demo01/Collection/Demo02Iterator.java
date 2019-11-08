package com.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    迭代器：
        由来：迭代器有很多种，每种集合存储数据的原理不同，取出元素的方式也不同
                所以我们可以使用迭代器，来取出集合中的元素，是一种通用的取出集合中元素的方式
        原理：即Collection集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个
                元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。这种取出方式专业
                术语称为迭代。
         迭代器是一个接口
         java.util.Iterator<E>:迭代器接口
              对 collection 进行迭代的迭代器。
        Iterator<E>接口中的方法：
            boolean hasNext() 如果仍有元素可以迭代，则返回 true
            E next() 取出集合中的下一个元素。
        迭代器的使用：
            在Collection集合中有一个方法叫iterator(),它返回Iterator接口的实现类对象（了解：迭代器实现类是每个集合的内部类）
             Iterator<E> iterator()返回在此 collection 的元素上进行迭代的迭代器。
             我们无需关注Iterator接口的实现类是谁，我们只需要知道Iterator接口中的方法如何使用
             会使用Iterator接口来接收这个实现类的对象即可，这种编程方式（只关注接口）叫面向接口编程
         迭代器的使用步骤：
            1.创建集合对象，集合中添加元素
            2.使用集合中的方法iterator获取迭代器对象
            3.使用迭代器Iterator中的方法hasNext和next依次取出集合中的元素
 */
public class Demo02Iterator {
    public static void main(String[] args) {
//        1.创建集合对象，集合中添加元素
        Collection<String> coll = new ArrayList<>();
//        Collection<String> coll = new HashSet<>();
        coll.add("姚明");
        coll.add("詹姆斯");
        coll.add("科比");
        coll.add("库里");
        coll.add("艾弗森");
        /*
        2.使用集合中的方法iterator获取迭代器对象
            迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
        */
        Iterator<String> it = coll.iterator();
        /*
        3.使用迭代器Iterator中的方法hasNext和next依次取出集合中的元素
        boolean hasNext() 如果仍有元素可以迭代，则返回 true
            E next() 取出集合中的下一个元素。
            发现迭代器取出元素是一个重复的过程，所以可以使用循环优化
            不知道集合中有多少元素，使用while循环
            while循环结束条件，hasNet方法返回false
        */
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------");
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String s = it2.next();
            System.out.println(s);
        }
        /*boolean b = it.hasNext();
        System.out.println(b);//true
        String s = it.next();
        System.out.println(s);//姚明

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//詹姆斯

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//科比

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//库里

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//艾弗森

        b = it.hasNext();
        System.out.println(b);//false
        s = it.next();//没有元素，再取出元素就会抛出NoSuchElementException没有元素异常
        System.out.println(s);
*/
    }
}
