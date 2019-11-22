package com.yixianen.demo04Lambda;

public class Demo02ABC {
    public static void main(String[] args) {
        //使用匿名内部类,创建ABC接口的实现类
        show(new ABC() {
            @Override
            public void method(int a) {
                System.out.println(a);
            }
        },10);

        //使用Lambda简化匿名内部类
        show((int a)->{
            System.out.println(a);
        },10);

        //使用Lambda简化格式
        show(a-> System.out.println(a),10);
    }

    public static void show(ABC abc,int a){
        abc.method(a);
    }
}
