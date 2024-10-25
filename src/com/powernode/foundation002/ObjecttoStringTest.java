package com.powernode.foundation002;

import java.util.Date;
/*
* Object类的 toString 方法测试
* Object类中的 toString（）方法
    1、这个方法的作用是：将 java 对象转换成字符串的表示形式

    2、Object 类中 toString()方法的默认实现是怎样的？
        public String toString(){
            return getClass().getName() + @ + Integer.toHexString(hashCode());
        }
        默认实现是：完整类名 + @ + 十六进制的数字
        这个输出结果可以等同看作一个 java 对象的内存地址
* */
public class ObjecttoStringTest {
    public static void main(String[] args) {
        DateClass date1 = new DateClass();
        String s = date1.toString();
        System.out.println(s);

        Date date = new Date();
        String s1 = date.toString();
        System.out.println(s1);

        DateClass date2 = new DateClass(1999,04,12);
        String s2 = date2.toString();
        System.out.println(s2);

        DateClass date3 = new DateClass(2000, 01, 01);
        System.out.println(date3);

    }
}
