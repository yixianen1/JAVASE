package com.yixianen.demo09Predicate;

import java.util.function.Predicate;

/*
    Predicate接口中的默认方法negate:用于对结果进行取反
        default Predicate<T> negate() {
            return (t) -> !test(t);
        }
 */
public class Demo04Predicate_negate {
    /*
        定义一个方法
            参数传递一个字符串
            参数传递一个Predicate方法
     */
    public static void checkString(String s, Predicate<String> pre){
        //使用Predicate接口中的方法test对字符串进行判断
        //boolean b = !pre.test(s);
        //negate:用于对结果进行取反
        boolean b = pre.negate().test(s);//等价于 !pre.test(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //调用checkString,参数Predicate是一个函数式接口,所以可以使用Lambda重写test方法
        checkString("123a",(String s)->{
            //判断字符串是否包含a
            return s.contains("a");
        });
    }
}
