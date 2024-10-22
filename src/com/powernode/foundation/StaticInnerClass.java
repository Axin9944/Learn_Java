package com.powernode.foundation;
/*
    静态内部类：可以把静态内部类当作静态变量来看待
    结论：在静态内部类中，无法直接访问外部类的实例相关的数据
*/
public class StaticInnerClass {
    //静态变量
    private static int i = 100;
    //实例变量
    private int j = 200;
    //静态方法
    public static void m1(){
        System.out.println("外部类的 m1 方法执行了");
    }
    //实例方法
    public void m2(){
        System.out.println("外部类的 m2 方法执行了");
    }
    //静态内部类
    public static class InnerClass {
        private int x = 5;
        private static int z = 6;
        public void x(){
            System.out.println(i);
            //System.out.println(j);  静态内部类无法访问实例变量
            System.out.println(x);
            System.out.println(z);
            System.out.println("静态内部类的 m1 方法执行了");
            m1();
            //m2();   静态内部类无法访问实例方法
        }
    }
}
