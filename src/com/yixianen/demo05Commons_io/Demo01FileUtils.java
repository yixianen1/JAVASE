package com.yixianen.demo05Commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
    Apache提供的commons_io组件
    工具类FileUtils操作文件的工具类
        static String readFileToString(File file)：读取文件内容，并返回一个String；
        static void writeStringToFile(File file, String data)：将内容content写入到file中；
        static void copyFile(File srcFile, File destFile): 文件复制
        static void copyDirectoryToDirectory(File srcDir, File destDir);文件夹复制
    注意:
        以上方法参数都是File类型    
 */
public class Demo01FileUtils {
    public static void main(String[] args) throws IOException {
        show04();
    }

    /*
        static void copyDirectoryToDirectory(File srcDir, File destDir);文件夹复制
     */
    private static void show04() throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("c:\\demo"),new File("d:\\"));
    }

    /*
        static void copyFile(File srcFile, File destFile): 文件复制
     */
    private static void show03() throws IOException {
        long s = System.currentTimeMillis();
        FileUtils.copyFile(new File("c:\\1.exe"),new File("d:\\1.exe"));
        long e = System.currentTimeMillis();
        System.out.println(e-s);//1746毫秒
    }

    /*
        static void writeStringToFile(File file, String data)：将内容content写入到file中；
     */
    private static void show02() throws IOException {
        FileUtils.writeStringToFile(new File("day11\\commons.txt"),"我是Commons写的数据");
    }

    /*
        static String readFileToString(File file)：读取文件内容，并返回一个String；
     */
    private static void show01() throws IOException {
        String s = FileUtils.readFileToString(new File("day11\\src\\com\\itheima\\demo01\\BufferedStream\\Demo01BufferedWriter.java"));
        System.out.println(s);
    }
}
