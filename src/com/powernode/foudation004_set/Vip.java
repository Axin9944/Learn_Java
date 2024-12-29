package com.powernode.foudation004_set;

public class Vip <NameType, AgeType>{
    private NameType name;
    private AgeType age;

    public NameType getName() {
        return name;
    }

    public void setName(NameType name) {
        this.name = name;
    }

    public AgeType getAge() {
        return age;
    }

    public void setAge(AgeType age) {
        this.age = age;
    }

    public Vip(NameType name, AgeType age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
