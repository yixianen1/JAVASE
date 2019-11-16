package com.yixianen.demo03map;

import java.util.HashMap;
import java.util.Scanner;

/*
    练习_计算一个字符串中每个字符出现次数
    分析:
        1.使用Scanner获取一个字符串
        2.定义一个HashMap集合key存储每种字符,value存储字符个数
        3.遍历字符串,获取字符串中的每一个字符
            a.可以使用String类中的方法toCharArray,把字符串转换为一个字符数组
            b.可以使用String类中的方法charAt(i)+length()
        4.使用获取到字符,根据Map集合的方法containKey,判断Map集合中是否包含指定的字符
            true:字符存在
                a.使用Map集合中的get方法,根据key获取value(字符个数)
                b.value++
                c.put(字符,value)
            false:字符不存在
                put(字符,1)
        5.遍历集合,查看结果
 */
public class Demo03Test {
    public static void main(String[] args) {
        //1.使用Scanner获取一个字符串
        System.out.println("请输入一个字符串:");
        String s = new Scanner(System.in).next();
        //2.定义一个HashMap集合key存储每种字符,value存储字符个数
        HashMap<Character,Integer> map = new HashMap<>();
        //3.遍历字符串,获取字符串中的每一个字符
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            //4.使用获取到字符,根据Map集合的方法containsKey,判断Map集合中是否包含指定的字符
            if(map.containsKey(key)){
                //true:字符存在
                //a.使用Map集合中的get方法,根据key获取value(字符个数)
                Integer value = map.get(key);
                //b.value++
                //c.put(字符,value)
                map.put(key,++value);
            }else{
                //false:字符不存在 put(字符,1)
                map.put(key,1);
            }
        }
        //5.遍历集合,查看结果
        System.out.println(map);
    }
}
