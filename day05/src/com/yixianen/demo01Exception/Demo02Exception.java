package com.yixianen.demo01Exception;

/*
    异常的产生过程解析
    分析一下异常如何产生了,产生异常之后怎么处理的异常
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int element = getElement(3, arr);
        System.out.println(element);
    }

    /*
        定义一个方法,根据数组的索引查找并返回对应的元素
        参数:
            int index
            int[] arr
     */
    public static int getElement(int index,int[] arr){
        int element = arr[index];
        return element;
    }
}
