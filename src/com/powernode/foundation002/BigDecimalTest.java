package com.powernode.foundation002;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal dob1 = new BigDecimal("3.14151415141514151415141514151415141514151415926");
        BigDecimal dob2 = new BigDecimal("1.5");
        System.out.println(dob1);
        System.out.println(dob2);
        System.out.println("===========================================");


        // add方法
        System.out.println(dob1.add(dob2));
        System.out.println("===========================================");

        // subtract 方法
        System.out.println(dob1.subtract(dob2));
        System.out.println("===========================================");

        // multiply 方法
        System.out.println(dob1.multiply(dob2));
        System.out.println("===========================================");

        // divide 方法
        // BigDecimal.divide()' called without a rounding mode argument
        System.out.println(dob1.divide(dob2));
        System.out.println("===========================================");

        // movePointLeft 方法
        System.out.println(dob1.movePointLeft(1));
        System.out.println("===========================================");

        // movePointRight 方法
        System.out.println(dob1.movePointRight(2));
        System.out.println("===========================================");

        // 数字格式化
        // 创建数字格式化对象
        DecimalFormat df = new DecimalFormat("###,###.###");

        // 格式化
        String s1 = df.format(314156.14151415141514151415141514151415141514151415926);
        System.out.println(s1);
        System.out.println("===========================================");

        // 保留四位小数，不够补0
        DecimalFormat df1 = new DecimalFormat("####,###.00000");
        String s2 = df1.format(314129.14);
        System.out.println(s2);
    }
}
