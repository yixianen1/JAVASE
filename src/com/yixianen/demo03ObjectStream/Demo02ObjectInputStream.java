package com.yixianen.demo03ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
    对象的反序列化流:把文件中保存的对象以流的方式读取出来

    构造方法:
        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
        参数
            InputStream in:字节输入流
    特有的成员方法:
        Object readObject() 从 ObjectInputStream 读取对象。

    使用步骤:
        1.创建ObjectInputStream对象,构造方法中传递字节输入流
        2.使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        3.释放资源
    注意:
        public final Object readObject() throws IOException, ClassNotFoundException
        readObejct方法声明了两个异常
        ClassNotFoundException:class文件找不到异常
        反序列化有两个前提:
            1.被反序列化的类必须实现Serializable
            2.被反序列化的类必须有.class文件(Person.class)
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建ObjectInputStream对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\person.txt"));
        //2.使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        Object o = ois.readObject();
        System.out.println(o);

        /*Person p = (Person)o;
        System.out.println(p);*/

        //3.释放资源
        ois.close();
    }
}
