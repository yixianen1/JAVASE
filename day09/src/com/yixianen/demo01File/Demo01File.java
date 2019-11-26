package com.yixianen.demo01File;

import java.io.File;

/*
    java.io.File类
        文件和目录路径名的抽象表示形式。
        File类把计算机中文件和文件夹封装为File对象,我们使用File对象中的方法就可以操作文件和文件夹
            我们可以使用File类的方法,创建一个文件或者文件夹
            我们可以使用File类的方法,删除一个文件或者文件夹
            我们可以使用File类的方法,获取一个文件或者文件夹路径
            我们可以使用File类的方法,遍历文件夹
   需要掌握的三个基本单词:
        path:路径
        file:文件
        directory:文件夹(目录)

    路径:
        绝对路径:以盘符开始的路径
            c:\\1.jpg
            d:\\aaa\\bbbb\\ccc
            D:\Work_idea\EE331\\a.txt
        相对路径:相对于我们的项目根目录而言,使用项目的根目录作为路径,省略书写
            项目根目录:D:\Work_idea\EE331
            绝对:D:\Work_idea\EE331\\a.txt
            相对:a.txt
        简单记:没有写盘符的都是相对路径
        注意:
            路径是不区分大小写的
 */
public class Demo01File {
    public static void main(String[] args) {
        show03();
    }

    /*
        File类的构造方法
        File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数:
            File parent:父路径
            String child:子路径
         好处:
            把路径分为了父路径和子路径,使用路径更加灵活,可以传递不同的父路径和子路径来组成不同的File对象
            父路径是File类型,可以使用File类的方法,对父路径进行一些操作,在和子路径组成一个File对象
     */
    private static void show03() {
        File parent = new File("d:\\");
        String child = "a.txt";
        File file = new File(parent,child);
        System.out.println(file);//d:\a.txt
    }

    /*
        File类的构造方法
        File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        参数:
            String parent:父路径
            String child:子路径
         好处:
            把路径分为了父路径和子路径,使用路径更加灵活,可以传递不同的父路径和子路径来组成不同的File对象
     */
    private static void show02() {
        //String parent = "c:\\";
        String parent = "e:\\";
        String child = "a.txt";
        File f = new File(parent,child);
        System.out.println(f);//c:\a.txt  d:\a.txt
    }

    /*
        File类的构造方法
        File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数:
            pathname:就是一个文件/文件夹的路径
        注意:
            1.构造方法传递的路径可以是绝对路径,也可以是相对路径
            2.构造方法传递的路径可以是以文件结尾的,也可以是以文件夹结尾
            3.构造方法中传递的路径,是存在的或者不存在都可以
                构造方法仅仅是把字符串的路径封装为File对象,不考虑真实性
     */
    private static void show01() {
        File f1 = new File("c:\\a.txt");
        System.out.println(f1);//c:\a.txt

        File f2 = new File("E:\\WorkSpeace\\IDEAworkspeace\\JAVASE\\a.txt");
        System.out.println(f2);//E:\WorkSpeace\IDEAworkspeace\JAVASE\a.txt

        File f3 = new File("a.txt");//省略了E:\WorkSpeace\IDEAworkspeace\JAVASE\a.txt
        System.out.println(f3);//a.txt

        File f4 = new File("day09\\abc");//省略了E:\WorkSpeace\IDEAworkspeace\JAVASE\a.txt
        System.out.println(f4);
    }
}
























