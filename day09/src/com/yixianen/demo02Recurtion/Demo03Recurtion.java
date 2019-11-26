package com.yixianen.demo02Recurtion;

/*
    递归求阶乘
    n! = n * (n-1) *...* 3 * 2 * 1
    5! = 5*4*3*2*1;
 */
public class Demo03Recurtion {
    public static void main(String[] args) {
        int jc = getJC(5);
        System.out.println(jc);//120
    }

    /*
        定义一个方法,计算阶乘
        n! = n * (n-1) *...* 3 * 2 * 1
        已知:
            n
            1
        递归的目的:获取下一个被乘的数字(n-1)
        递归结束的条件:获取到1的时候结束
     */
    public static int getJC(int n){
        //递归结束的条件:获取到1的时候结束
        if(n==1){
            return 1;
        }
        //递归的目的:获取下一个被乘的数字(n-1)
        return  n * getJC(n-1);
    }
}
