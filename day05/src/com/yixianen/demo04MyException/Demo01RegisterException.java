package com.yixianen.demo04MyException;

import java.util.ArrayList;
import java.util.Scanner;

/*
    自定义异常的使用:

   boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true。

    需求:
        我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
    分析:
        1.定义一个集合,保存用户已经注册的用户名(数据库)
        2.使用Scanner获取用户输入的注册用户名
        3.定义一个方法,用于判断用户输入的用户名是否已经被占用
            a.使用Collection集合中的方法contains判断集合中是否包含用户输入的用户名
                true:抛出一个异常对象,告之注册的人"亲，该用户名已经被注册"
                false:把用户名存储到集合中
 */
public class Demo01RegisterException {
    public static void main(String[] args) {
        //1.定义一个集合,保存用户已经注册的用户名(数据库)
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王武");
        //2.使用Scanner获取用户输入的注册用户名
        System.out.println("请输入您要注册的用户名:");
        String regName= new Scanner(System.in).next();

        //调用checkName方法
        checkName(list,regName);
    }

    /*
        3.定义一个方法,用于判断用户输入的用户名是否已经被占用
     */
    public static void checkName(ArrayList<String> list,String regName){
        //使用Collection集合中的方法contains判断集合中是否包含用户输入的用户名
        boolean b = list.contains(regName);
        if(b){
            //true:抛出一个异常对象,告之注册的人"亲，该用户名已经被注册"
            try {
                throw new RegisterException("亲，该用户名已经被注册!");
            } catch (RegisterException e) {
                e.printStackTrace();
            }
        }else{
            //false:把用户名存储到集合中
            list.add(regName);
            System.out.println("恭喜您,注册成功!");
        }
        System.out.println(list);
    }
}
