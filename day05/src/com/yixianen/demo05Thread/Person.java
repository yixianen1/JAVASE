package com.yixianen.demo05Thread;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i <20; i++) {
            System.out.println(name+" run-->"+i);
        }
    }
}
