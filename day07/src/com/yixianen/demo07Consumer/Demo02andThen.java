package com.yixianen.demo07Consumer;

import java.util.function.Consumer;

/*
    Consumer接口中的默认方法:
        default Consumer<T> andThen(Consumer<? super T> after) {
            Objects.requireNonNull(after);
            return (T t) -> { this.accept(t); after.accept(t); };
        }
        作用:
            用于连接两个Consumer接口
            一个是调用andThen方法的Consumer接口this
            一个是andThen方法的参数after
 */
public class Demo02andThen {
    /*
        定义一个方法,方法的参数
            传递一个字符串
            传递两个Consumer接口,泛型使用String
     */
    public static void printString(String s, Consumer<String> con1,Consumer<String> con2){
        //可以使用con1中的方法accept对字符串s进行消费
        //con1.accept(s);
        //可以使用con2中的方法accept对字符串s进行消费
        //con2.accept(s);
        //可以使用andThen方法,连接两个Consumer接口,在进行消费数据
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        //调用printString方法,参数Consumer是一个函数式接口,所以可以使用Lambda表达式,重写accept方法
        printString("柳岩",(String s)->{
            System.out.println(s+"正在打篮球!");
        },(String s)->{
            System.out.println(s+"正在踢足球!");
        });
    }
}
