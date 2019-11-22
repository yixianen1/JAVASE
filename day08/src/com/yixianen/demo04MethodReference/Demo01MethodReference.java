package com.yixianen.demo04MethodReference;

import java.util.function.Function;

/*
    类--构造引用
 */
public class Demo01MethodReference {
    /*
        定义一个方法
        参数传递一个字符串的姓名
        参数传递Function接口,泛型使用<String,Person>
     */
    public static void getPerson(String name, Function<String,Person> fun){
        //使用Function接口中的方法apply把字符串转换为Person对象
        Person p = fun.apply(name);
        System.out.println(p);
    }


    public static void main(String[] args) {
        //调用getPerson方法,参数Function是一个函数式接口,所以使用Lambda重写apply方法
        getPerson("柳岩",(String name)->{
            return new Person(name);
        });

        //简化Lambda
        getPerson("柳岩",name->new Person(name));

        /*
            方法引用:简化Lambda表达式
            Person类的构造方法public Person(String name) 是已经存在的
            目的就是使用构造方法根据姓名创建一个Person对象
            所以我们可以使用构造方法的名称引用new创建对象
                构造方法的名称::new
         */
        getPerson("柳岩",Person::new);
    }
}
