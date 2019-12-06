package com.yixianen.demo03ObjectStream;

import java.io.Serializable;

/*
    进行序列化和反序列化的时候会抛出NotSerializableException:没有序列化异常
    类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
    Serializable接口也叫标记型接口
        当序列化反序列化的类实现了Serializable接口,那么就相当于给类添加了一个标记
        当我们继续序列化和反序列化的时候,会检查类上是否有这个标记
            有:可以序列化或者反序列化
            没有:就会抛出NotSerializableException

    static:静态关键字
        private static int age;
        oos.writeObject(new Person("小美女",18));
        Object o = ois.readObject(); Person{name='小美女', age=0}
        静态优先于非静态加载到内存
        静态的成员变量属于类,不属于某个对象,被所有的对象所共享
        而我们序列化的是对象,所以静态的成员变量不能被序列化

    transient:瞬态关键字
        作用:阻止成员变量序列化
        private transient int age;
        oos.writeObject(new Person("小美女",18));
        Object o = ois.readObject(); Person{name='小美女', age=0}
 */
public class Person implements Serializable{

    /*
        为了防止序列号冲突异常InvalidClassException
        可以手动添加一个序列号
        要求:
            private static final long serialVersionUID = 任意值L;
        常量是不能改变的,无论类的定义如何修改,序列号都不会改变
     */
    private static final long serialVersionUID = 1L;

    private String name;
    //private static int age;
    //private transient int age;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
