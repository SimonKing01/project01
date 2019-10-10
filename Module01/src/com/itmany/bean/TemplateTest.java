package com.itmany.bean;

import java.util.ArrayList;

/**
 * @author wangy
 * @create 2019-10-10 15:12
 */
public class TemplateTest {
private static final int a=1;
public static final String AB="asd";


    public static void main(String[] args) {
        //模板2
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);

        System.out.println("TemplateTest.main");
/*

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
*/
    String[] strs=new String[]{"lilei","hanmeimei","tom","jerry"};
    //fori
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        //iter
        for (String str : strs) {
            System.out.println(str);
        }
//itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);

        }

//末班4
        ArrayList objects = new ArrayList<>();
        objects.add(123);
        objects.add(345);
        objects.add(678);
        for (int i = 0; i < objects.size(); i++) {

        }
        for (int i = objects.size() - 1; i >= 0; i--) {
            
        }
        for (Object object : objects) {


        }
    }
    public void method(){
        String a=null;
        if (a == null) {
            return;
        }
        if (a != null) {
            
        }
        if (a != null) {
            if (a != null) {

            }
            if (a == null) {
                if (a != null) {
                    if (a == null) {
                        if (a != null) {

                        }
                    }
                }
            }
        }
    }


}
