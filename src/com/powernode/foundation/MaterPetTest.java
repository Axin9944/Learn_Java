package com.powernode.foundation;
/*
 * 多态的测试
 * */
public class MaterPetTest {
    public static void main(String[] args) {
        MasterClass m = new MasterClass();
        PetClass cat = new CatClass("麻子",4);
        PetClass dog = new DogClass("明东",5);
        m.feed(cat);
        m.feed(dog);
    }
}
