package com.powernode.foundation002;

public class BoxMethodTest {
    public static void main(String[] args) {
        //compare 比较大小
        Double d1 = 3.14;
        Double d2 = 3.15;
        System.out.println(Double.compare(d1, d2));  // -1

        //max
        System.out.println(Double.max(d1, d2));     // 3.15

        //min
        System.out.println(Double.min(d1, d2));     // 3.14

        //实例方法：equals()
        Double d3 = 3.14;
        System.out.println(d1.equals(d2)); // false
        System.out.println(d1 == d3);      //false
        System.out.println(d1.equals(d3)); //true
    }
}
