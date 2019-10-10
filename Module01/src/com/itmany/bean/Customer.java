package com.itmany.bean;


import java.util.ArrayList;
import java.util.Date;

/**
 * 这是一个测试类
 */
public class Customer extends Person {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static void main(String[] aagg) {
        System.out.println("hello world module01");
        abcmethod();
        ArrayList list = new ArrayList();
        list.add(0, 1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    public static void abcmethod() {
        System.out.println("1");
        Date date = new Date();
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
