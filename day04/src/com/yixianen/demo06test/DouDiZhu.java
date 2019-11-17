package com.yixianen.demo06test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
    斗地主综合案例_有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个Map集合,key:牌的索引,value:组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //先存储大王和小王
        //定义一个牌的索引
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //定义两个数组,一个存储花色,一个存储序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //循环嵌套遍历两个数组,组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //把组装好的牌存储到集合中
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);

        /*
            2.洗牌
            使用Collections中的方法shuffle:打乱集合中元素顺序
         */
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);

        /*
            3.发牌
         */
        //定义4个List集合,存储玩家的牌和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历存储牌索引的pokerIndex集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer paiIndex = pokerIndex.get(i);
            //先判断底牌,防止发光了
            if (i >= 51) {
                //给底牌发牌
                diPai.add(paiIndex);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(paiIndex);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(paiIndex);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(paiIndex);
            }
        }

        /*
            4.排序
            使用Collections中的方法sort:对集合中的元素进行默认排序(升序)
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //调用看牌的方法
        lookPoker("唐嫣", player01, poker);
        lookPoker("丽颖", player02, poker);
        lookPoker("金莲", player03, poker);
        lookPoker("底牌", diPai, poker);

    }

    /*
        5.看牌
        定义一个看牌的方法
        参数:
            String name:玩家名称
            ArrayList<Integer> list:存储玩家或者底牌集合
            HashMap<Integer,String> poker:存储牌的Map集合
        查表法:
            遍历List集合,获取到Map集合的key,通过key找到value
     */
    public static void lookPoker(String name, ArrayList<Integer> list, HashMap<Integer, String> poker) {
        //先打印玩家姓名,不换行
        System.out.print(name + ": ");
        //遍历List集合,获取到Map集合的key
        for (Integer key : list) {
            //通过key找到value
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        //打印完每个玩家的牌之后换行
        System.out.println();
    }
}
