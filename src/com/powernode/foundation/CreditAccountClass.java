package com.powernode.foundation;

/*
 * this 关键字 及 super 关键字 及 static 关键字 final 关键字 的测试
 *
 *
 * */
public class CreditAccountClass extends AccountClass{
    static {
        System.out.println("CreditAccountClass 的静态方法执行了");
    }
    static void creditaccount(){
        System.out.println("creditaccount 方法执行了");
    }

    /*@Override  静态方法不能重写
    static void account(){
        System.out.println("account 方法执行了");
    }*/
    //静态变量不能重新赋值
    //Π = 3.15;

    //Variable 'k' might not have been initialized
    public static final int k = 200;
    //k = 300;

    //信用
    private double credit;

    public CreditAccountClass() {
    }

    public CreditAccountClass(String name, int acounId) {
        super(name, acounId);
    }

    public CreditAccountClass(String name, int acounId, double credit) {
        super(name, acounId);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public void doSome(){
        System.out.println("================================");
        System.out.println("CreditAccount 的 do some 方法执行了");
        super.doSome();
        System.out.println("CreditAccount 的 do some 方法执行结束了");
        System.out.println(this);
        System.out.println("================================");
        //super不能直接输出
        //System.out.println(super);
    }

    //'m1()' cannot override 'm1()' in 'com.powernode.foundation.AccountClass'; overridden method is final
    //静态方法不能覆盖   医疗保障
    //public static final void m1(){}

    public void creditAccountclass(){
        System.out.println("CreditAccountClass's creditAccountclass method invoke!");
    }
}
