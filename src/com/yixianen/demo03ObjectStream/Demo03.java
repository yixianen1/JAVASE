package com.yixianen.demo03ObjectStream;

import java.io.*;

/*
    使用序列流写多个对象
    使用反序列化流读取多个对象

    read方法读取到文件末尾返回-1
    readLine读取到文件返回null
    readObject读取到文件末尾,在读取抛出终止异常EOFException
 */
public class Demo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*//1.创建ObjectOutputStream对象,构造方法中传递字节输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\person2.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObjet,把对象写入到文件中
        oos.writeObject(new Person("小美女1",18));
        oos.writeObject(new Person("小美女2",18));
        oos.writeObject(new Person("小美女3",18));
        //3.释放资源
        oos.close();*/

        //1.创建ObjectInputStream对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\person2.txt"));
        //2.使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        Object o = ois.readObject();
        System.out.println(o);
        o = ois.readObject();
        System.out.println(o);
        o = ois.readObject();
        System.out.println(o);
        o = ois.readObject();
        System.out.println(o);//EOFException 当输入过程中意外到达文件或流的末尾时，抛出此异常。
        //3.释放资源
        ois.close();
    }
}
