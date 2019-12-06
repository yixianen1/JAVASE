package com.yixianen.demo06Prop;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<K,V> implements Map<K,V>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
        Properties是一个唯一和IO流相结合的集合
        使用Properties集合中的方法store,可以把集合中临时数据,写入到文件中持久化存储
        使用Properties集合中的方法load,把文件中保存键值对,读取到集合中使用

    属性列表中每个键及其对应值都是一个字符串。
        Properties集合键和值默认都使用String类型
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        使用Properties集合中的方法load,把文件中保存键值对,读取到集合中使用
            void load(InputStream inStream)
            void load(Reader reader)
            参数:
                InputStream inStream:字节输入流,不能读取含有中文的文件
                Reader reader:字符输入流,能读取含有中文的文件
        注意:
            1.在保存键值对的文件中,可以使用#添加注释,被注释的键值对,不会被读取
            2.在保存键值对的文件中,键与值的连接符号可以使用=或者空格
            3.在保存键值对的文件中,键与值默认都是String类型,不要添加引号
     */
    private static void show03() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用Properties集合中的方法load,把文件中保存键值对,读取到集合中使用
        //prop.load(new FileInputStream("day10\\prop2.txt"));
        prop.load(new FileReader("day10\\prop2.txt"));
        //遍历集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    /*
        使用Properties集合中的方法store,可以把集合中临时数据,写入到文件中持久化存储
            void store(OutputStream out, String comments)
            void store(Writer writer, String comments)
            参数:
                OutputStream out:字节输出流,不能写中文
                Writer writer:字符输出流,可以写中文
                String comments:注释,解释说明保存文件有什么用;不能写中文,默认使用Unicode编码(会有乱码)
     */
    private static void show02() throws IOException {
        //创建Properties集合,添加数据
        Properties prop = new Properties();
        prop.setProperty("张三", "20");
        prop.setProperty("柳岩", "18");
        prop.setProperty("迪丽热巴", "18");
        prop.setProperty("赵丽颖", "18");
        //使用Properties集合中的store,可以把集合中临时数据,写入到文件中持久化存储
        prop.store(new FileOutputStream("day10\\prop1.txt"), "save data");
        prop.store(new FileWriter("day10\\prop2.txt"), "save data");

    }

    /*
        Properties集合的基本使用:存储数据,遍历集合取出数据
        Properties健和值都是String,包含了一些操作String的特有方法
             Object setProperty(String key, String value) 往Properties集合中添加键值对,此方法相当于Map集合的put
             String getProperty(String key)  通过key获取value,此方法相当于Map集合的get(key)方法
             Set<String> stringPropertyNames() 返回此属性列表中的键集,此方法相当于Map集合的keySet
     */
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用Properties集合中的方法setProperty,往集合中添加键值对
        prop.setProperty("张三", "20");
        prop.setProperty("柳岩", "18");
        prop.setProperty("迪丽热巴", "18");
        prop.setProperty("赵丽颖", "18");
        //prop.put("aaa","bbbb");

        //使用Properties集合中的方法stringPropertyNames,把所有的key取出来存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();
        //遍历Set集合
        for (String key : set) {
            //使用Properties集合中的方法getProperty,通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
