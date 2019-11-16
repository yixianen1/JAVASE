package com.yixianen.demo05debug;

/*
    debug:断点调试
    作用:
        1.可以查看程序执行的流程
        2.可以调试程序运行过程中出现的一些问题
    使用步骤:
        1.在行号的右边,鼠标左键单击增加一个断点(每个方法的第一行)
        2.右键-->debug
        3.程序就会停止到添加的第一个断点处
    快捷键:
        f8:逐行执行代码
        f7:进入到方法中
        shift+f8:跳出方法
        f9:跳到下一个断点
        ctry+f2:停止debug,也会停止程序
        console:切换到控制台(控制台打印的内容)
        variables:显示程序中所有变量的区域

 */
public class Demo01DeBug {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }
}

