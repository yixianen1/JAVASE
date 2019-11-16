package com.yixianen.demo05debug;

/*
    快捷键:
        f8:逐行执行代码
        f7:进入到方法中
        shift+f8:跳出方法
        f9:跳到下一个断点,没有下一个断点,会结束程序
        ctry+f2:停止debug,也会停止程序
        console:切换到控制台(控制台打印的内容)
        variables:显示程序中所有变量的区域
 */
public class Demo02DeBug {
    public static void main(String[] args) {
        int sum = getSum(10, 20, 30);
        System.out.println(sum);
    }

    public static int getSum(int... arr) {
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
}
