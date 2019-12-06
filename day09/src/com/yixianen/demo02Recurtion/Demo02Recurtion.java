package com.yixianen.demo02Recurtion;

/*
    使用递归累加求和:
        计算1-n之间的和
 */
public class Demo02Recurtion {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    /*
        定义一个求和的方法
            1+2+3+..+n
            n+(n-1)+(n-2)+..+1
        已知:
            n:100,1000...
            1:
        递归的目的:获取下一个被加的数字(n-1)
        递归结束的条件:获取1的时候结束
     */
    public static int getSum(int n) {//100,99,98...1
        //递归结束的条件:获取1的时候结束
        if (n == 1) {
            return 1;
        }
        //递归的目的:获取下一个被加的数字(n-1)
        return n + getSum(n - 1);
    }
}
