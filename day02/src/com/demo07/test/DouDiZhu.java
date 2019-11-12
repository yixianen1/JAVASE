package com.demo07.test;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个集合,存储54张牌
        ArrayList<String> poker = new ArrayList<>();
        //先存储大王和小王
        poker.add("大王");
        poker.add("小王");
        //定义两个数组,一个存储花色,一个存储序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //循环嵌套遍历两个数组,组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //把组装好的牌存储到集合中
                poker.add(color + number);
            }
        }
        //System.out.println(poker);

        /*
            2.洗牌
            使用Collections集合工具类中的方法
                static void shuffle(List<?> list)
                使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(poker);
        //System.out.println(poker);

        //3.发牌
        //定义4个集合,存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //遍历poker集合,获取每一张牌
        for (int i = 0; i < poker.size(); i++) {
            String pai = poker.get(i);
            //先判断底牌,否则就发没有了
            if (i >= 51) {
                //给底牌发牌
                diPai.add(pai);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(pai);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(pai);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(pai);
            }
        }

        //4.看牌
        System.out.println("周润发: " + player01);
        System.out.println("周星驰: " + player02);
        System.out.println("刘德华: " + player03);
        System.out.println("底牌: " + diPai);
    }
}