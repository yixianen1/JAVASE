package com.yixianen.demo01File;

import java.io.File;

/*
    File类的成员方法_判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo03FileMethod {
    public static void main(String[] args) {
        show02();
    }

    /*
        public boolean isDirectory() ：此File表示的是否为目录。
            判断构造方法中的路径是否以文件夹结尾
                是文件夹结尾,返回true
                不是文件夹结尾,返回false
        public boolean isFile() ：此File表示的是否为文件。
            判断构造方法中的路径是否以文件结尾
                是文件结尾,返回true
                不是文件结尾,返回false
        注意:
            两个方法的使用前提,都是这个路径必须是存在的,否则都会返回false
            计算机中除了文件就是文件夹,所以两个方法互斥
     */
    private static void show02() {
        File f1 = new File("c:\\1.jpg");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//true
        System.out.println("----------------------------");

        File f2 = new File("day10");//路径不存在
        System.out.println(f2.isDirectory());//false
        System.out.println(f2.isFile());//false
        System.out.println("----------------------------");

        File f3 = new File("day09");
        System.out.println(f3.isDirectory());//true
        System.out.println(f3.isFile());//false
    }

    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        判断构造方法中传递的路径是真的(存在)还是假的(不存在)
        返回值:boolean
            路径存在,返回true
            路径不存在,返回false
     */
    private static void show01() {
        File f1 = new File("c:\\1.jpg");
        System.out.println(f1.exists());//true

        File f2 = new File("c:\\abc\\ccc\\1.txt");
        System.out.println(f2.exists());//false

        File f3 = new File("day09");
        System.out.println(f3.exists());//true
    }
}
