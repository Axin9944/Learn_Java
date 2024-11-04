package com.powernode.foundation002;
import java.math.BigInteger;
public class BigIntegerTest {
    public static void main(String[] args) {
        // Long number too large
        // long i = 999999999999999999999L;
        BigInteger num1 = new BigInteger("999999999999999999999");
        System.out.println(num1);
        BigInteger num2 = new BigInteger("2");

        // add方法
        // 相加
        System.out.println(num1.add(num2));

        //subtract 方法
        // 减法
        System.out.println(num1.subtract(num2));
        System.out.println(num1.subtract(num1.add(num2)));

        //multiply() 方法
        // 乘法
        System.out.println(num1.multiply(num2));

        // divide 方法
        // 除法
        System.out.println(num1.divide(num2));

        // abs
        // 绝对值
        System.out.println(num1.subtract(num1.add(num2)).abs());

        //pow
        // 次幂
        System.out.println(num2.pow(4));

        // sqrt
        // 平方根
        System.out.println(num2.pow(4).sqrt());
    }
}
