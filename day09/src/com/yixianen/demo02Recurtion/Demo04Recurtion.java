package com.yixianen.demo02Recurtion;

import java.io.File;

/*
    综合案例:文件搜索
    需求:
        搜索D:\aaa 目录中的.java 文件
        d:\\aaa
        d:\\aaa\\aaa.txt
        d:\\aaa\\aaa.java
        d:\\aaa\\a
        d:\\aaa\\a\\a.txt
        d:\\aaa\\a\\a.java
        d:\\aaa\\a\\a.jpg
     最终结果:
        d:\\aaa\\aaa.java
        d:\\aaa\\a\\a.java
 */
public class Demo04Recurtion {
    public static void main(String[] args) {
        File dir = new File("d:\\aaa");
        getAllFile(dir);
    }

    /*
        定义一个方法,方法的参数传递被遍历的目录
     */
    public static void getAllFile(File dir){
        //System.out.println(dir);//打印被遍历的目录
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历得到的file对象进行判断
            if(file.isDirectory()){
                //file对象是一个文件夹,则继续遍历
                //我们发现getAllFile方法就是一个传递文件夹,遍历文件夹的方法
                //调用getAllFile即可-->方法自己调用自己(递归)
                getAllFile(file);
            }else{
                //是一个文件,则打印
                //把file对象转换为String对象
                /*
                    file.getName(); a.java
                    file.getPath(); d:\aaa\a\a.java
                    file.toString(); d:\aaa\a\a.java
                 */
                String name = file.getName();
                //增加一个判断,只打印.java结尾的文件
                if(name.endsWith(".java")){
                    //是.java结尾的文件,则打印
                    System.out.println(file);
                }
            }
        }
    }
}
