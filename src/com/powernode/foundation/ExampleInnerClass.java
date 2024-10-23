package com.powernode.foundation;
/*
    实例内部类：等同可以看作实例变量
    结论：实例内部类中可以直接访问外部类实例成员和静态成员。
*/
public class ExampleInnerClass {
    //静态变量
    private static int  i = 100;
    //静态方法
    private static void m1(){
        System.out.println("ExampleInnerClass的 m1 方法执行了");
    }
    //实例变量
    private int j = 200;
    //实例方法
    private void m2(){
        System.out.println("ExampleInnerClass的 m2 方法执行了");
    }
    //实例内部类
    public class InnerClass{
        public void x(){
            System.out.println("==================");
            System.out.println("ExampleInnerClass 的 InnerClass 的  m1 方法执行了");
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();
        }
    }
}
