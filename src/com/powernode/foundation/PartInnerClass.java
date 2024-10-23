package com.powernode.foundation;
/*
    局部内部类 ： 等同于局部变量
    结论：局部内部类能不能访问外部类的数据，取决于局部内部类所在的方法。
    如果这个方法是静态的：只能访问外部类中静态的
    如果这个方法是实例的： 可以都访问
    局部内部类得在方法类初始化。
*/
public class PartInnerClass {
    //静态变量
    private static int i = 200;
    //静态方法
    private static void m1(){
        System.out.println("PartInnerClass的 m1 方法执行了");
    }
    //实例变量
    private int j = 300;
    //实例方法
    private void m2(){
        System.out.println("PartInnerClass的 m2 方法执行了");
    }

    //实例局部内部类
    public void x(){
        int f = 200;
        class InnerClass{
            public void x(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(f);
                m1();
                m2();
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.x();
    }
    //静态局部内部类
    public static void y(){
        int z = 100;
        class InnerClass{
            public void y(){
                System.out.println(i);
                //System.out.println(j);  不能访问实例变量
                System.out.println(z);
                m1();
                //m2();  不能访问实例方法
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.y();
    }

}
