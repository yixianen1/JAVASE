package com.demo04.genericMethod;

/*
    定义含有泛型的方法:(重点)
        泛型定义在修饰符和返回值类型之间
    格式:
        修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
            方法体;
        }
    什么时候确定泛型的数据类型:调用方法的时候确定泛型的数据类型,传递什么类型的参数,泛型就是什么类型
 */
public class GenericMethod {
    //定义一个含有泛型的方法
    public <M> void show(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static <S> void method(S s){
        System.out.println(s);
    }
}
