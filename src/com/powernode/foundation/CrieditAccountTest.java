package com.powernode.foundation;


/*
 * this 关键字 及 super 关键字 及 static 关键字 final 关键字 的测试
 *
 *
 * */
public class CrieditAccountTest {
    public static void main(String[] args) {
        /*CreditAccountClass creditAccount = new CreditAccountClass("陈明东",2024001,0.5);
        System.out.println(creditAccount.Π);
        System.out.println(creditAccount.k);
        creditAccount.m1();
        creditAccount.doSome();*/
        CreditAccountClass creditAccount = new CreditAccountClass();//都会执行父类的静态方法
    }
}
