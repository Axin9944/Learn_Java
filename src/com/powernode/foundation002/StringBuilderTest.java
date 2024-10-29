package com.powernode.foundation002;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(412);
        StringBuilder sb3 = new StringBuilder("陈明东");
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);

        //测试StringBuilder的扩容
        sb1.append("abcdefghijklmnopq");
    }
}
