package com.demo01.object;

/**
 * java.lang.Object类
 * 学习目标：能够说出object类的特点
 * 任何一个类都可以使用object类中的方法
 *
 * Object类的toString方法
 * 底层源码
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 *     getClass().getName()：获取包名+类名package com.demo01.object.Person
 *     "@" :原样输出
 *     hashCode():获取一个系统随机给出的十进制数
 *     Integer.toHexString：把十进制的整数转换为十六进制
 *     学习目标：
 *          能够重写Object类的toString方法
 *          快捷键：ALt+insert选择toString
 */

public class Demo01toString {
    public static void main(String[] args) {
        Person p = new Person("迪丽热巴",18);
        //Person继承了Object类，所以可以使用toString方法
        System.out.println(p.toString());

        //直接打印对象的名字，就是调用对象的toString方法
        System.out.println(p);
    }
}
