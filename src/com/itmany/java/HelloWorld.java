package com.itmany.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    private String abc;

    public static void main(String[] args) {
        //region Description
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        System.out.println("hello world!!");
        //endregion
        System.out.println("hello world!!");
        ArrayList list = new ArrayList();

    }

    public void method02() {
        abc = "123";

        try {
            FileInputStream fis = new FileInputStream("helloworld.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
