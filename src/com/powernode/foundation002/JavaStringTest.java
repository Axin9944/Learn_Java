package com.powernode.foundation002;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/*
*  String 构造方法的测试
*
* */
public class JavaStringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
        String s4 = "abc" + "def";
        System.out.println(s3 == s4); //false

        //加入常量池
        String s5 = s3.intern();
        System.out.println(s4 == s5);//true

        String s6 = new String("abcdef");//新对象
        System.out.println(s6 == s5);//false;
        //System.out.println(s6.toString());

        char[] c1 = new char[]{'陈','明','东'};
        String s7 = new String(c1);
        System.out.println(c1);

        String s8 = new String(c1,0,2);
        System.out.println(s8);

        byte[] b1 = new byte[]{97,98,99,100,96};
        String s9 = new String(b1);
        System.out.println(s9);

        String s10 = new String(b1,0,3);
        System.out.println(s10);

        try {
            byte[] b2 = "陈明东是李煌欣的大儿子。".getBytes("UTF-8");
            System.out.println(b2);
            String s11 = new String(b2,"UTF-8");
            System.out.println(s11);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        byte[] b2 = "陈明东是李煌欣的大儿子。".getBytes(StandardCharsets.UTF_8);
        String s11 = new String(b2,StandardCharsets.UTF_8);
        for (int i = 0; i < b2.length - 1; i++) {
            System.out.print(b2[i]);
            System.out.print(", ");
        }
        System.out.println(s11);

    }
}
