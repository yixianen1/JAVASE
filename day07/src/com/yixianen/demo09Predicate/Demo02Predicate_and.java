package com.yixianen.demo09Predicate;

import java.util.function.Predicate;

/*
    逻辑运算符:用于连接布尔表达式
        &&:与运算符,有false则false
        ||:或运算符,有true,则true
        !:非(取反)运算符,非真则假,非假则真
    需求:
        判断一个字符串,必须同时满足两个条件,可以使用&&运算符连接
            a.字符串必须包含"a"
            b.字符串的长度必须大于5
        而Predicate接口中有一个默认方法and,也是用于连接两个必须同时满足两个条件
            default Predicate<T> and(Predicate<? super T> other) {
                Objects.requireNonNull(other);
                return (t) -> this.test(t) && other.test(t);
            }
 */
public class Demo02Predicate_and {
    /*
        定义一个方法
            参数传递一个字符串
            参数传递两个Predicate接口
     */
    public static void checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        //a.字符串必须包含"a" b.字符串的长度必须大于5  必须同时满足两个条件,可以使用&&运算符连接
        //boolean b = pre1.test(s) && pre2.test(s);
        //Predicate接口中有一个默认方法and,也是用于连接两个必须同时满足两个条件
        boolean b = pre1.and(pre2).test(s); //等价于  pre1.test(s) && pre2.test(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //调用checkString,参数Predicate是一个函数式接口,所以可以使用Lambda重写test方法
        checkString("abc1",(String s)->{
            //a.字符串必须包含"a"
            return s.contains("a");
        },(String s)->{
            //b.字符串的长度必须大于5
            return s.length()>5;
        });
    }
}

