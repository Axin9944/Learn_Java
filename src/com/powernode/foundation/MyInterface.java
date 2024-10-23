package com.powernode.foundation;


/*
*  接口的测试
* */
public interface MyInterface {
    // public static final 可以省略
    public static final int num1 = 1;
    int num2 = 2;

    //定义方法时 public abstract也可以省略
    public abstract void m1();
    void m2();

    //jdk9之后 接口允许定义私有的实例方法
    private void privateMethod(){
        System.out.println("privateMethod执行了");
    }

    //默认方法
    default void defaultMethod(){
        System.out.println("接口中的默认方法defaultMethod执行了");
        privateMethod();
    }


    //私有的静态方法
    private static void privateStaticMethod(){
        System.out.println("privateStaticMethod执行了");
    }

    static void staticMethod(){
        System.out.println("接口的静态方法执行了");
        privateStaticMethod();
    }
}
