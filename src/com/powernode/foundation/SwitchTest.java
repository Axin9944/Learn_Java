package com.powernode.foundation;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = input.nextInt();
        /*switch (n){
            case 1:
                System.out.println("数字是：" + n);
                break;
            case 2:
                System.out.println("数字是：" + n);
                break;
            default:
                System.out.println("no");
        }*/
        /*switch (n){
            case 1, 2, 3:
                System.out.println("数字是 1 2 3");
                break;
            case 4, 5, 6:
                System.out.println("数字是 4 5 6");
                break;
            default:
                System.out.println("no");
        }*/
        switch (n) {
            case 1, 2, 3 -> System.out.println("数字是 1 2 3");
            case 4, 5, 6 -> System.out.println("数字是 4 5 6");
            default -> System.out.println("no");
        }
    }
}
