package com.yixianen.demo04varArgs;

/*
    可变参数:
        是JDK1.5之后出现的
    作用:当我们定义方法的时候,方法参数的数据类型已经确定了,但是参数的个数不确定,就可以使用可变参数
    格式:
        修饰符 返回值类型 方法名(数据类型...变量名){
        }
    可变参数底层原理:
        数据类型...变量名:传递参数个数可以是任意个(0,1,2,...n)
        会根据传递参数的个数,创建一个对应的数组,来存储这些参数
        我们可以把可变参数看成是一个数组,只是这个数组会根据参数个数产生变化
 */
public class Demo01varArgs {
    public static void main(String[] args) {
        //int sum = getSum();
        //int sum = getSum(10);
        int sum = getSum(10, 20);
        //int sum = getSum(10,20,30,40,50,60,70,80,90,100);
        System.out.println(sum);


    }

    /*
       定义一个计算n个int类型整数和的方法
       方法参数的数据类型已经确定就是int类型
       但是参数的个数不确定,所以就可以使用可变参数
       getSum();就会创建一个长度为0的数组,存储参数 int[] arr = new int[]{};
       getSum(10);就会创建一个长度为1的数组,存储参数 int[] arr = new int[]{10};
       getSum(10,20);就会创建一个长度为2的数组,存储参数 int[] arr = new int[]{10,20};
       getSum(10,20,30,40,50,60,70,80,90,100);就会创建一个长度为10的数组,存储参数 int[] arr = new int[]{10,20,30,40,50,60,70,80,90,100};
    */
    public static int getSum(int... arr) {
        //System.out.println(arr);//[I@50cbc42f
        //System.out.println(arr.length);//0
        //定义一个变量,初始值为0,记录累加求和
        int sum = 0;
        //遍历数组,获取数组中的每一个元素
        for (int i : arr) {
            //累加求和
            sum += i;
        }
        //把和返回
        return sum;
    }

    /*
       定义一个计算三个int类型整数和的方法
    */
    /*public static int getSum(int a,int b,int c){
        return a+b+c;
    }*/

    /*
        定义一个计算两个int类型整数和的方法
     */
    /*public static int getSum(int a,int b){
        return a+b;
    }*/
}
