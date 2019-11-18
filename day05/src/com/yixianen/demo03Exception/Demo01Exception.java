package com.yixianen.demo03Exception;

import java.util.ArrayList;

/*
    异常注意事项:
        多个异常使用捕获又该如何处理呢？
        1. 多个异常分别处理。
        2. 多个异常一次捕获，多次处理。
        3. 多个异常一次捕获一次处理。
 */
public class Demo01Exception {
    public static void main(String[] args) {
        //1. 多个异常分别处理。
        /*try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            System.out.println(list.get(10));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }*/

        //2. 多个异常一次捕获，多次处理。一个try多个catch
        /*try{
           int[] arr = {1,2,3};
            System.out.println(arr[1]);

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            System.out.println(list.get(10));
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/

        //注意:一个try多个catch,子类异常必须定义在父类异常变量的上边
        /*try{
            int[] arr = {1,2,3};
            System.out.println(arr[1]);

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            System.out.println(list.get(10));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }*/

        /*
            3. 多个异常一次捕获一次处理。
            好处:
                简单
             弊端:
                多个异常只能有一种处理方式
         */
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[7]);

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("后续代码");
    }
}
