package com.powernode.foundation002;

public class StringBuilderMethodTest {
    public static void main(String[] args) {
        //append方法
        StringBuilder stb1 = new StringBuilder();
        stb1.append(10);
        stb1.append("hello   ");
        stb1.append(false);
        stb1.append("                               ");
        stb1.append(new Object());
        stb1.append("world");
        System.out.println(stb1);
        System.out.println(stb1.length());

        //delete方法
        // 删除两个下标之间（含第一个下标）的元素不包括第二个下标
        stb1.delete(15,46);
        System.out.println(stb1);

        //deleteCharAt方法  删除一个元素
        stb1.deleteCharAt(8);
        stb1.deleteCharAt(8);
        System.out.println(stb1);

        //insert方法
        // 在指定下标的后面追加字符串
        stb1.insert(8,"world");
        System.out.println(stb1);

        //replace
        // 将指定下标的字符串替换
        stb1.replace("10hello world".length(),("10hello world".length() + "false".length()),"true");
        System.out.println(stb1);

        //setChat
        // 将指定下标的字符替换
        stb1.setCharAt("10hello".length(),'-');
        System.out.println(stb1);

        //setLength
        // 将字符串设定为指定长度
        stb1.setLength(13);
        System.out.println(stb1);
    }
}
