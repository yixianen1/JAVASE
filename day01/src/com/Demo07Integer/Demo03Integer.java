package com.Demo07Integer;
/*
    基本数据类型与字符串类型之间的转换
        基本数据类型-->String类型
            1.基本数据类型数据+"":常用
            2.包装类中的toString方法
                static String toString(int i) 返回一个表示指定整数的String对象
            3.String类中的valueOf方法
                static String valueOf(int i)返回int参数的字符串表示形式
        String类型-->基本数据类型
            1.包装类的构造方法（很少用） Integer("1")-->intValue()
            2.包装类中的parseXXX方法
                Integer:int parseInt("字符串的整数")
                Double:int parseDouble("字符串的整数")
                ...
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //能够将基本数据类型装换为对应的字符串
        //基本数据类型-->String类型
        int a = 10;
        String s1 = a + "";
        System.out.println(s1 + 100);//字符串连接10100

        String s2 = Integer.toString(10);
        System.out.println(s2 + 100);//10100

        String s3 = String.valueOf(a);
        System.out.println(s3 + 100);//10100

        //String类型-->基本数据类型
        //能够将字符串转换为对应的基本类型
        int i = Integer.parseInt("10");
        System.out.println(i + 100);//110

        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);//true
    }
}
