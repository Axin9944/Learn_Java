package com.powernode.foundation;

public class MyInterfaceImpl implements MyInterface, C{
    @Override
    public void a() {
        System.out.println("a执行了");
    }

    @Override
    public void b() {
        System.out.println("b执行了");
    }

    @Override
    public void c() {
        System.out.println("c执行了");
    }

    @Override
    public void m1() {
        System.out.println("m1执行了");
    }

    @Override
    public void m2() {
        System.out.println("m2执行了");
    }
}
