package com.powernode.foundation002;

public class JavaRegularTest {
    public static void main(String[] args) {
        // split()方法
        //将当前字符串以某个正则表达式的子字符串进行分割，返回一个字符串数组
        String s1 = "陈1明2东3是4条5狗6";
        String[] strs = s1.split("\\d");
        for(String s : strs){
            System.out.println(s);
        }

        String[] strs1 = "1999-04-12".split("-");
        for(String s : strs1){
            System.out.println(s);
        }
        String s2 = "name=zhangsan&password=123&email=zhangsan@123.com&gender=男";
        String[] strs2 = s2.split("&");
        for(String s : strs2){
            System.out.println(s);
        }

        String s3 = "陈永卓是条狗";
        String s4 = s3.replace("陈永卓","陈明东");
        System.out.println(s4);

        String s5 = "a1b2c3d4e5f6";
        String s6 = s5.replaceAll("\\d","");
        System.out.println(s6);

        //matches()
        //判断当前字符串是否符合正则表达式regex
        String ipReg = "(\\d{1,3}.){3}\\d{1,3}";
        String s7 = "192.168.1.1";
        System.out.println(s7.matches(ipReg));
    }
}
