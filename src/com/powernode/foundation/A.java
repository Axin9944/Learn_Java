package com.powernode.foundation;

public interface A {
    void a();
}

interface B{
    void b();
}

interface C extends A, B{
    void c();
}
