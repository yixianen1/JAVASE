package com.Demo07Integer;

/*
    包装类：
        基本数据类型，使用起来非常方便，但是没有方法操作这些数据
        所以我们可以使用一个类，把基本数据类型的数据装起来，叫包装类
        在包装类中，可以定义一些方法，操作基本类型的数据
    学习目标：
        能够说出8种基本类型对应的包装类名称
         基本的数据类型:4类8种
            byte short  int long    float   double  boolean char
         对应的包装类:java.lang中
            Byte Short  Integer Long    Float   Double  Boolean Character
 */
public class Demo01Integer {
    public static void main(String[] args) {
        /*
            装箱：把基本类型的数据存储到包装类
                1.包装类的构造方法：
                    Integer(int value)构造一个新分配的 Integer 对象，它表示指定的 int 值。
                    Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                2.包装类的静态方法valueOf：
                    static Integer valueOf(int i)返回一个表示指定的 int 值的 Integer 实例。
                    static Integer valueOf(String s)返回保存指定的 String 的值的 Integer 对象。
                注意：
                    参数：String s 传递字符串的基本类型，传递其他类型会抛出异常 "1"正确  "a"错误
            拆箱：在包装类中取出基本类型的数据
                包装类的方法
                    int intValue() 以int类型返回该Integer的值。
         */

        //装箱：把基本类型的数据存储到包装类
        Integer in1 = new Integer(1);
        System.out.println(in1);//重写了toString方法 1
//        Integer in2 = new Integer("a");//NumberFormatException: For input string: "a"
        Integer in2 = new Integer("1");
        System.out.println(in2);//1

        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        //拆箱：在包装类中取出基本类型的数据
        int i = in1.intValue();
        System.out.println(i);
    }
}
