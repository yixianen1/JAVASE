package com.yixianen.demo03ObjectStream;

import java.io.*;
import java.util.ArrayList;

/*
    练习：序列化集合
    想要实现序列化多个对象,反序列化多个对象
    我们可以把对个对象存储到一个集合中
    对集合进行序列化和反序列化(集合也是一个对象)
 */
public class Demo04ArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个ArrayList集合对象,保存多个Person对象
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小美女1",18));
        list.add(new Person("小美女2",18));
        list.add(new Person("小美女3",18));
        list.add(new Person("小美女4",18));
        //创建一个序列化的流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\list.txt")) ;
        //使用ObjectOutputStream对象writeObject写对象
        oos.writeObject(list);
        //释放资源
        oos.close();

        //创建一个反序列化流ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\list.txt"));
        //使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        Object o = ois.readObject();
        //把Object强制为ArrayList集合
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        //遍历集合
        for (Person p : list2) {
            System.out.println(p);
        }
    }
}
