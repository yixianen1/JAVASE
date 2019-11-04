package com.demo05.System;

import java.util.Arrays;

public class Demo02System {
    public static void main(String[] args) {
        /*
            能够使用System类的数组复制方法
            static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
            参数：
                src - 源数组。
                srcPos - 源数组中的起始位置（源数组的开始索引）。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。
         */
        //定义一个源数组
        int[] src = {1,2,3,4,5};
        int[] dest = new int[src.length];
        //复制之前遍历dest数组
        System.out.println(Arrays.toString(dest));//[0, 0, 0, 0, 0]
        //使用arraycopy方法，把src数组中的前3个元素赋值到dest前三个位置
        System.arraycopy(src,0,dest,0,3);
        //复制之后遍历dest数组
        System.out.println(Arrays.toString(dest));//[1, 2, 3, 0, 0]
    }
}
