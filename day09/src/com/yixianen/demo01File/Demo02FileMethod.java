package com.yixianen.demo01File;

import java.io.File;

/*
    File类的成员方法_获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class Demo02FileMethod {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /*
        public long length()  ：返回由此File表示的文件的长度。
            获取构造方法中传递路径指向文件的大小,单位是字节
        注意:
            1.文件夹是没有大小的
            2.构造方法中指定的路径不存在,返回0
     */
    private static void show04() {
        File f1 = new File("E:\\作业\\java\\12_1.jar");
        long length = f1.length();
        System.out.println(length);//813,052 字节

        File f2 = new File("D:\\base\\20180721EE331\\day09\\abc.txt");
        System.out.println(f2.length());//0

        File f3 = new File("D:\\base\\20180721EE331");
        System.out.println(f3.length());//0 4096 4kb
    }

    /*
        public String getName()  ：返回由此File表示的文件或目录的名称。
            获取构造方法中传递路径的文件/文件夹的名称(路径末尾部分)
     */
    private static void show03() {
        File f1 = new File("c:\\a.txt");
        System.out.println(f1.getName());//a.txt

        File f2 = new File("abc\\def\\ccc");
        System.out.println(f2.getName());//ccc
    }

    /*
        public String getPath() ：将此File转换为路径名字符串。
            获取构造方法中传递的路径
        File类重写了Object类的toString方法
            public String toString() {
                return getPath();
            }
     */
    private static void show02() {
        File f1 = new File("c:\\a.txt");
        System.out.println(f1.getPath());

        File f2 = new File("abc\\def\\ccc");
        System.out.println(f2.getPath());

        System.out.println(f1.toString());
    }

    /*
        public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        获取构造方法中传递路径的绝对路径
        无论构造方法中传递的是相对路径还是绝对路径,此方法返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("c:\\a.txt");
        System.out.println(f1.getAbsolutePath());//c:\a.txt

        File f2 = new File("abc\\def\\ccc");
        System.out.println(f2.getAbsolutePath());

        File f3 = new File("day09\\abc");
        System.out.println(f3.getAbsolutePath());
    }
}
