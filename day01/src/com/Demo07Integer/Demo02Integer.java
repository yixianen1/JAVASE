package com.Demo07Integer;

import java.util.ArrayList;
import java.util.Arrays;

/*
    在jdk1.5以后，装箱与拆箱可以自动进行
        学习目标：
            能够说出自动装箱、自动拆箱的概念：
	            基本类型的数据和包装类之间可以自动的相互转换
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
            自动装箱:把基本类型的值直接赋值给包装类
                Integer in = 1;相当于Integer in = new Integer(1);

         */
        Integer in = 1;

        /*
            自动拆箱：包装类可以直接与基本类型计算
                in是包装类，无法直接参与计算
                必须先把包装类转换为基本类型的值再和1相加
                in + 1;相当于in.intValue()+1=2
            自动装箱：
                in = 2;
         */
        in = in + 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱list.add(new Integer(1));

        int i = list.get(0);//自动拆箱 int i = list.get(0).intValue();
    }
}
