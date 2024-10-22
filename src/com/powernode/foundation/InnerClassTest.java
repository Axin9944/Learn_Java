package com.powernode.foundation;
//'com.powernode.foundation.ExampleInnerClass' is not an enclosing class
/*
*   实例内部类的实例化：
*    OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
*
*  Static member 'com.powernode.foundation.PartInnerClass.y()' accessed via instance reference
* */

public class InnerClassTest {
    public static void main(String[] args) {
        StaticInnerClass.InnerClass innerClass1 = new StaticInnerClass.InnerClass();
        ExampleInnerClass.InnerClass innerClass2 = new ExampleInnerClass().new InnerClass();
        PartInnerClass innerClass3 = new PartInnerClass();
        innerClass1.x();
        innerClass2.x();
        innerClass3.x();
        PartInnerClass.y();
    }
}
