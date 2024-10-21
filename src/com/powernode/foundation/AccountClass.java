package com.powernode.foundation;

/*
* this 关键字 及 super 关键字 及 static 关键字 final 关键字 的测试
*
*
* */
public class AccountClass {
    static {
        System.out.println("AccountClass 的静态方法执行了");
    }
    static void account(){
        System.out.println("account 方法执行了");
    }
    //静态变量
    public final double Π = 3.14;

    //姓名
    private String name;
    //账户ID
    private int acounId;

    public AccountClass() {
    }

    public AccountClass(String name, int acounId) {
        this.name = name;
        this.acounId = acounId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcounId() {
        return acounId;
    }

    public void setAcounId(int acounId) {
        this.acounId = acounId;
    }
    //dosome方法
    public void doSome(){
        System.out.println("Account 的 do Some 方法执行了");
        System.out.println("Account 的 do Some 方法执行结束");
    }

    public static final void m1(){
        System.out.println("account的m1方法执行，不可覆盖");
    }

    public void accountclass(){
        System.out.println("AccountClass's accountclass methond invoke!");
    }
}
