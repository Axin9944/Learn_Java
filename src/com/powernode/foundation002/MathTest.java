package com.powernode.foundation002;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        int a = -5;
        //绝对值
        System.out.println(Math.abs(a));

        // 向上取整
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(2.9));
        System.out.println(Math.ceil(2.00000));

        // 向下取整
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));

        // 最大值
        System.out.println(Math.max(4.1, 4.9));

        // 最小值
        System.out.println(Math.min(4.1, 4.9));

        // 四舍五入
        System.out.println(Math.round(5.1));
        System.out.println(Math.round(5.9));

        // 平方根
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(9));

        // 幂
        System.out.println(Math.pow(2, 4));


        System.out.println("======================================================");
        // 生成随机数
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }
}
