package com.yixianen.demo09Stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    收集Stream结果_收集到集合中
    把Stream流转换为集合
    转换为List集合List<> list= stream.collect(Collectors.toList());
    转换为Set集合List<> set= stream.collect(Collectors.toSet());
 */
public class Demo01StreamToCollection {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "慢羊羊", "懒羊羊", "沸羊羊", "灰太狼", "红太狼", "小灰灰");
        //转换为List集合List<> list= stream.collect(Collectors.toList());
        //List<String> list = stream.collect(Collectors.toList());
        //System.out.println(list);//[美羊羊, 喜羊羊, 慢羊羊, 懒羊羊, 沸羊羊, 灰太狼, 红太狼, 小灰灰]

        //转换为Set集合List<> set= stream.collect(Collectors.toSet());
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);//[美羊羊, 沸羊羊, 红太狼, 灰太狼, 小灰灰, 喜羊羊, 懒羊羊, 慢羊羊]
    }
}
