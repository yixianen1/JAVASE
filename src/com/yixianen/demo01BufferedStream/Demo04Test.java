package com.yixianen.demo01BufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.4 练习:文本排序
        请将文本信息恢复顺序。
    分析:
        1.创建Map集合,key和value都使用String
        2.创建BufferedReader对象,构造方法中传递FileReader对象
        3.创建BufferedWriter对象,构造方法中传递FileWriter对象
        4.使用BufferedReader对象readLine,以行的方式读取文本
        5.对读取的每行文本进行切割,把序号和文本内容存储到一个String数组
        6.把序号和文本内容存储到Map集合中(key会进自然排序)
        7.遍历Map集合,获取每一个对健值
        8.使用BufferedWriter对象中的方法write,把键值对拼接在一起写在内存缓冲区中
        9.写换行
        10.释放字符
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1.创建Map集合,key和value都是用String
        Map<String,String> map = new HashMap<>();
        //2.创建BufferedReader对象,构造方法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\in.txt"));
        //3.创建BufferedWriter对象,构造方法中传递FileWriter对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\out.txt"));
        //4.使用BufferedReader对象readLine,以行的方式读取文本
        String line;
        while((line = br.readLine())!=null){
            //5.对读取的每行文本进行切割,把序号和文本内容存储到一个String数组
            String[] arr = line.split("\\.");
            //6.把序号和文本内容存储到Map集合中(key会进自然排序)
            map.put(arr[0],arr[1]);
        }
        //System.out.println(map);
        //7.遍历Map集合,获取每一个对健值
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            //8.使用BufferedWriter对象中的方法write,把键值对拼接在一起写在内存缓冲区中
            bw.write(key+"."+value);
            //9.写换行
            bw.newLine();
        }
        //10.释放字符
        bw.close();
        br.close();
    }
}
