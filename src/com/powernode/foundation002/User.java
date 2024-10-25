package com.powernode.foundation002;

public class User {
    //姓名
    private String name;
    //年龄
    private int age;
    //住址
    private Address add;

    public User() {
    }

    public User(String name, int age, Address add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
