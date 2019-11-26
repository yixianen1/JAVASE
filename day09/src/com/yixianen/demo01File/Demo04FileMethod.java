package com.yixianen.demo01File;

import java.io.File;
import java.io.IOException;

/*
    File类的成员方法_创建删除功能的方法
        - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        - public boolean mkdir() ：创建由此File表示的目录。
        - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
        - public boolean delete() ：删除由此File表示的文件或目录。

 */
public class Demo04FileMethod {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        public boolean delete() ：删除由此File表示的文件或目录。
            删除文件/文件夹的路径在构造方法中给出
            可以删除文件或者文件夹
        返回值:boolean
            文件/文件夹存在,删除成功,返回true
            文件/文件夹不存在,返回false; 文件夹有内容,返回false
        注意:
            delete方法,删除的时候,不走回收站,直接在硬盘删除
            需要谨慎
     */
    private static void show03() {
        File f1 = new File("day09\\新建文件夹");
        System.out.println(f1.delete());

        File f2 = new File("day09\\b.txt");
        System.out.println(f2.delete());

        File f3 = new File("day09\\111");
        System.out.println(f3.delete());//false
    }

    /*
        public boolean mkdir() ：只能创建单级文件夹
        public boolean mkdirs() ：既能创建单级文件夹,又能创建多级文件夹
        创建文件夹的路径和名称在构造方法中给出
        返回值:boolean
            文件夹不存在,创建文件夹,返回true
            文件夹存在,不会创建,返回false; 构造方法中的路径不存在,返回false
        注意:
            此方法只能创建文件夹,不能创建文件
     */
    private static void show02() {
        File f1 = new File("day09\\abc");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);

        File f2 = new File("w:\\aaa");
        System.out.println(f2.mkdir());//false

        File f3 = new File("day09\\111\\222\\333\\444");
        System.out.println(f3.mkdirs());

        File f4 = new File("day09\\b.txt");//创建文件夹的名称叫b.txt
        System.out.println(f4.mkdirs());
    }

    /*
        public boolean createNewFile() ：创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出
        返回值:boolean
            文件不存在,创建文件,返回true
            文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径不存在,会抛出异常
                public boolean createNewFile() throws IOException
                createNewFile方法声明抛出了异常,处理这个异常
                要么throws继续声明抛出,最终给JVM,要么try...catch自己处理
     */
    private static void show01() throws IOException {
        File f1 = new File("day09\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:"+b1);

        File f2 = new File("w:\\b.txt");
        //boolean b2 = f2.createNewFile();//IOException 文件的路径不存在

        File f3 = new File("c:\\b.txt");
        //boolean b3 = f3.createNewFile();// IOException: 拒绝访问,win10系统没有在c根目录创建文件的权限

        File f4 = new File("day09\\新建文件夹");//新建的文件的名称叫"新建文件夹"  看类型,不要看名称
        System.out.println(f4.createNewFile());
    }
}
