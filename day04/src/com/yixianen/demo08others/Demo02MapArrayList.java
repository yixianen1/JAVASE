package com.yixianen.demo08others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    集合嵌套
        集合中的元素仍是一个集合
        集合可以随意嵌套(Map可以嵌套Collection,Collection也可以嵌套Map)
 */
public class Demo02MapArrayList {
    public static void main(String[] args) {
        //定义一个存储省份名称和城市的Map集合
        Map<String,ArrayList<String>> map = new HashMap<>();
        //创建存储城市的ArrayList集合
        ArrayList<String> hb = new ArrayList<>();
        hb.add("石家庄");
        hb.add("张家口");
        hb.add("承德");
        hb.add("邯郸");

        ArrayList<String> nmg = new ArrayList<>();
        nmg.add("呼和浩特");
        nmg.add("包头");
        nmg.add("锡林郭勒");
        nmg.add("赤峰");

        ArrayList<String> gd = new ArrayList<>();
        gd.add("深圳");
        gd.add("广州");
        gd.add("东莞");
        gd.add("中山");

        //把省份名称和存储城市的ArrayList集合添加到Map中
        map.put("河北省",hb);
        map.put("内蒙古",nmg);
        map.put("广东省",gd);

        //遍历Map集合:keySet+增强for
        Set<String> set = map.keySet();
        for (String key : set) {
            //通过key获取value
            ArrayList<String> value = map.get(key);
            //遍历ArrayList集合
            for (String cityName : value) {
                System.out.println(key+"-->"+cityName);
            }
        }
    }
}
