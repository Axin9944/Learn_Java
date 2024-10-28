package com.powernode.foundation002;

import java.util.ArrayList;

public class JavaStringMethodTest {
    public static void main(String[] args) {
        //  返回索引处的char值
        System.out.println("陈明东是条狗".charAt(2)); //东

        //  返回字符串长度
        System.out.println("陈明东是条狗".length());//6

        //  isEmpty()判断字符串是否为空白字符串，如果length()是0就是空字符串
        String s = "";
        String s1 = "陈明东";
        String s2 = " ";
        System.out.println(s.isEmpty());    //true
        System.out.println(s1.isEmpty());   //false
        System.out.println(s2.isEmpty());   //false

        //  判断两个字符串是否相等 & 忽略大小写
        String s3 = "";
        String s4 = "abc";
        String s5 = new String("abc");
        System.out.println(s.equals(s3));   //true
        System.out.println(s4 == "abc");    //true
        System.out.println(s4 == s5);       //false
        System.out.println(s4.equals(s5));  //true


        String s6 = "java";
        String s7 = "JaVa";
        System.out.println(s6.equalsIgnoreCase(s7));//true

        //判断当前字符串是否包含某个字符串
        System.out.println("陈明东是条狗".contains("陈明东")); //true
        System.out.println("陈明东是条狗".contains("陈麻子")); //false

        //判断当前字符串是否以某个字符串开头/结尾
        System.out.println("陈明东是条狗".startsWith("陈明东")); //true
        System.out.println("陈明东是条狗".startsWith("陈麻子")); //false
        System.out.println("陈明东是条狗".endsWith("是条狗")); //true
        System.out.println("陈明东是条狗".endsWith("是条")); //false

        //两个字符串按照字典顺序比较大小 / 忽略大小写
        System.out.println("a".compareTo("b")); //-1
        System.out.println("a".compareTo("a")); //0
        System.out.println("a".compareTo("c")); //-2
        System.out.println("b".compareTo("a")); //1
        System.out.println("a".compareTo("A")); //32
        System.out.println("a".compareToIgnoreCase("A")); //0

        //获取当前字符中str字符串第一次出现的下标 / 最后一次出现的下标
        System.out.println("javamysqlc++javaoraclepythonspringdameng".indexOf("java")); //0;
        System.out.println("javamysqlc++javaoraclepythonspringdameng".indexOf("java",3)); //12

        System.out.println("javamysqlc++javaoraclepythonjavaspringdameng".lastIndexOf("java")); //28
        System.out.println("javamysqlc++javaoraclepythonjavaspringdameng".lastIndexOf("java",27));//12

        //将字符串转换为字符数组
        String s8 = "陈明东是条狗";
        char[] c1 = s8.toCharArray();
        for(char c : c1){
            System.out.print(c);
            System.out.print(" ");
        }

        System.out.println("http://www.baidu.com".substring(7));
        System.out.println("http://www.baidu.com".substring(5, 10)); //不包含结束下标

        //去除字符串前后空白
        String s9 = " a b c ";
        System.out.println(s9);
        System.out.println(s9.trim());
        String s10 = "\u3000\u3000\u3000\u3000\u3000\u3000a b   c\u3000\u3000\u3000\u3000\u3000\u3000";
        System.out.println(s10.trim());
        System.out.println(s10.strip());

        //去除前空白 / 去除后空白
        System.out.println(s10.stripLeading());
        System.out.println(s10.stripTrailing());
        System.out.println(s10.stripIndent());

        //将多个字符串以某个分割符连接
        String s11 = String.join("-","java","c++","python","mysql");
        System.out.println(s11);

        String year = "1999";
        String month = "04";
        String day = "12";
        System.out.println(String.join("/", year, month, day));

        ArrayList list = new ArrayList();
        list.add("abc");
        list.add("efg");
        list.add("hij");
        System.out.println(String.join("-", list));

        int a = 100;
        String s12 = a + "";
        System.out.println(a);
        System.out.println(s12);
        System.out.println(s12.equals(a));//false

        //将其他类型的数据转为String
        String s13 = String.valueOf(new Object());
        System.out.println(s13);
        User user = new User();
        user.setName("陈明东");
        user.setAge(20);
        String s14 = String.valueOf(user);
        System.out.println(s14);
        user = null;
        String s15 = String.valueOf(user);
        System.out.println(s15);
    }
}
