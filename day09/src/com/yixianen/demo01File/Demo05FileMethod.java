package com.yixianen.demo01File;

import java.io.File;

/*
    File类的成员方法_目录(文件夹)的遍历
        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
    注意:
        1.遍历文件夹的路径在构造方法中给出
        2.只能遍历文件夹,不能遍历文件,遍历文件会抛出空指针异常
        3.遍历文件夹的路径必须是存在的,否则也会抛出空指针异常
 */
public class Demo05FileMethod {
    public static void main(String[] args) {
        show01();
//        show02();
    }

    /*
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        遍历构造方法中给出的文件夹,获取文件夹中每一个文件/子文件夹,把文件/子文件夹封装为File对象,多个File对象,存储到一个File数组中返回
     */
    private static void show02() {
        //File file = new File("D:\\base\\20180721EE331\\day09\\a.txt");//NullPointerException
        //File file = new File("w:\\base\\20180721EE331\\day09");//NullPointerException
        File file = new File("D:\\base\\20180721EE331\\day09");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.toString());
        }
    }

    /*
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        遍历构造方法中给出的文件夹,获取文件夹中每一个文件/子文件夹的名称,把多个名称存储到一个String类型的数组中返回
        注意:
            不会遍历子文件夹
     */
    private static void show01() {
        File file = new File("D:\\");
        String[] arr = file.list();
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
