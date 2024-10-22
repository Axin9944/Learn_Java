package com.powernode.foundation;
/*
 * 多态的测试
 * */
public class CatClass extends PetClass{
    public CatClass() {
    }

    public CatClass(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " 正在吃猫粮");
    }
}
