package com.yixianen.demo08Function;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen:用于连接两个Function接口
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(this.apply(t));
    }

    需求:
        把String类型的"123",转换为Integer类型,把Integer类型123乘以10
        "123"->123*10->1230
    分析:
        需要定义两个Function接口
        1.Function<String,Ineger> fun1:把字符串转换为Integer
                Integer i = fun1.apply("123");
        2.Function<Integer,Integer> fun2:把整数乘以10
                Integer i2 = fun2.apply(i);
        可以使用andThen把两个Function接口连接到一起使用
            Integer i2 = fun1.and(fun2).apply("123");
            先使用fun1的apply方法,在使用fun2的apply方法
 */
public class Demo03andThen {
    /*
        定义一个方法
        参数传递一个字符串类型的整数
        参数传递两个Function接口,泛型分别是<String,Integer>,<Integer,Integer>
     */
    public static void reverse(String s, Function<String,Integer> fun1, Function<Integer,Integer> fun2){
        //"123"->123
        //Integer in = fun1.apply(s);
        //123*10
        //Integer in2 = fun2.apply(in);
        //可以使用andThen方法连接两个Function接口
        Integer in2 = fun1.andThen(fun2).apply(s);
        System.out.println(in2);//1230
    }

    public static void main(String[] args) {
        //调用reverse方法,参数Function是一个函数式接口,所以可以使用Lambda重写apply方法
        reverse("123",(String s)->{
            //"123"->123
            return Integer.parseInt(s);
        },(Integer in)->{
            //123*10
            return in*10;
        });
    }
}
