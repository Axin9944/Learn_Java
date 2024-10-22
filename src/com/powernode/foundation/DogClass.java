package com.powernode.foundation;
/*
 * 多态的测试
 * */
public class DogClass extends PetClass{
    public DogClass() {
    }

    public DogClass(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println(this.getName() + " 正在吃屎");
    }
}
