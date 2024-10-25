package com.powernode.foundation002;

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address gui = new Address("贵州", "贵阳", "1101");
        User mingDong = new User("麻子", 20, gui);
        Object m2 = mingDong.clone();
        System.out.println(mingDong == m2);
    }
}
