package com.powernode.foudation004_set;

import java.util.Objects;

/*
*   演示List集合的自定义排序规则
*
*   存放在HashMap集合key部分的元素必须同时重写hashCode + equals方法。
*   equals返回true时，hashCode必须相同
*
* */
public class User implements Comparable<User>{
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    *
    * 演示HashMap集合，重写 hashCode 及 equals 方法
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
