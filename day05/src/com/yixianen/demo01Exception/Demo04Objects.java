package com.yixianen.demo01Exception;

import java.util.Objects;

/*
    对象工具类Objects
    静态方法:
        public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
        public static <T> T requireNonNull(T obj,String message):查看指定引用对象不是null。

        public static <T> T requireNonNull(T obj, String message) {
            if (obj == null){
                throw new NullPointerException(message);
            }
            return obj;
        }
*/
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
        /*if(obj == null){
            throw new NullPointerException("对象的值是null");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"对象的值是null");
    }
}

