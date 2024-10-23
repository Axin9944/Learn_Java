package com.powernode.foundation;


/*
*   接口的测试
* */
public class MyInterfaceTest {
    public static void main(String[] args) {
        MyInterface m1 = new MyInterfaceImpl();


        m1.m1();
        m1.m2();
        //调用接口的静态方法
        m1.defaultMethod();

        //调用接口的静态方法
        MyInterface.staticMethod();


        //m1 不是A,B,C 接口，不能直接调用，要转型
        //Variable 'm1' is already defined in the scope
        if(m1 instanceof C){
            C m2 = (C)m1;
            m2.a();
            m2.b();
            m2.c();
        }

    }
}
