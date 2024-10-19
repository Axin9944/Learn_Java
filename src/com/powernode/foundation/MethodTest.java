package com.powernode.foundation;

/**
 *
 *方法测试 （递归）
 *
* */
public class MethodTest {
    public static void main(String[] args) {
        System.out.println("第10个斐波那契数为：" + fei(10));
        System.out.println("第5个斐波那契数为：" + fei(5));
        System.out.println("第6个斐波那契数为：" + fei(6));
        System.out.println("第1个斐波那契数为：" + fei(1));
        System.out.println("第3个斐波那契数为：" + fei(3));
        System.out.println("第3个斐波那契数为：" + fei(4));
    }
    public static int fei(int n){
        if (1 == n || 2 == n) {
            return 1;
        }else {
            return fei(n - 1) + fei(n - 2);
        }
    }
}
