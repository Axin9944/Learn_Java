package com.powernode.foundation002;

import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) {
        System.err.println("错误信息"); // 红色字体

        // 赋值数组
        int[] ints = {22,33,44,55};
        int[] newints = new int[ints.length - 1];
        System.arraycopy(ints,1,newints,0,newints.length);
        for (int nums : newints){
            System.out.println(nums);
        }

        System.out.println("===========================================");
        long ctm = System.currentTimeMillis();
        System.out.println(ctm);

        System.out.println("===========================================================");
        long nt = System.nanoTime();
        System.out.println(nt);

        try{
            int a = 10;
            int b = 0;
            System.out.println((a / b));
        } catch (ArithmeticException e){
            System.err.println("除数不能为0");
        }

        Map<String,String> map = System.getenv();
        for (String s : map.keySet()){
            System.out.print(s + " : ");
            System.out.println(map.get(s));
        }

        System.out.println("===========================================================");
        Properties properties = System.getProperties();
        System.out.println(properties);
    }
}
