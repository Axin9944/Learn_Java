package com.powernode.foundation002;


/*
* object 类的 hashCode() 及 finalize()方法测试
*
*
* */
public class ObjectHashCodeTest {
    public static void main(String[] args) {
        DateClass date1 = new DateClass();
        DateClass date = new DateClass();
        DateClass date2 = new DateClass(1999,04,12);
        int i = date1.hashCode();
        int i2 = date2.hashCode();
        int i3 = date.hashCode();
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        date = null;
        date1 = null;
        date2 = null;
        int count = 0;
        while(count++ < 1000000000){
            if (count % 1000 == 0){
                System.gc();
        }

    }
}}
