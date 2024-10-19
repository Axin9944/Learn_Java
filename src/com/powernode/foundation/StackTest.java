package com.powernode.foundation;

public class StackTest {
    public static void main(String[] args) {
        System.out.println("main方法开始执行了");
        m1();
        System.out.println("main方法执行结束");
    }
    public static void m1(){
        System.out.println("================================");
        System.out.println("m1方法开始执行");
        m2();
        System.out.println("m1方法执行结束");
    }
    public static void m2(){
        System.out.println("-------------------------------------");
        System.out.println("m2方法开始执行了");
        m3();
        System.out.println("m2方法执行结束");
    }
    public static void m3(){
        System.out.println("_______________________________________");
        System.out.println("m3方法开始执行了");
        System.out.println("m3方法执行结束");
    }

}
