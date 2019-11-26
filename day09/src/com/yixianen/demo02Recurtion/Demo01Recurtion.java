package com.yixianen.demo02Recurtion;

/*
    递归:方法自己调用自己
    什么时候用:当调用方法的主体不变,但是每次传递参数会变化,就可以使用递归

    递归分类:
        1.直接递归
            public static void a(){
                a();
            }
        2.间接递归
            public static void a(){
                b();
            }
            public static void b(){
                a();
            }
     递归的注意事项:
        1.递归必须有结束条件,保证方法能停下来,否则会发生内存溢出的错误
        2.递归有结束的条件,但是递归的次数也不能太多,否则会发生内存溢出的错误
        3.构造方法禁止递归
 */
public class Demo01Recurtion {
    public static void main(String[] args) {
        //a();
        //b(1);
    }

    /*
        3.构造方法禁止递归
        构造方法是创建对使用,递归就会在内存产生无数多个对象,也会导致内存溢出
     */
    /*public Demo01Recurtion() {
        Demo01Recurtion();
    }*/

    /*
            2.递归有结束的条件,但是递归的次数也不能太多,否则会发生内存溢出的错误
            11282
            Exception in thread "main" java.lang.StackOverflowError
         */
    private static void b(int i) {
        System.out.println(i);
        //增加一个判断打印到10000的时候结束方法
        if(i==12000){
            return;//结束方法
        }
        b(++i);
    }

    /*
        1.递归必须有结束条件,保证方法能停下来,否则会发生内存溢出的错误
        Exception in thread "main" java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a方法");
        a();
    }
}
