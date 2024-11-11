package com.powernode.foundation002;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        int num = 0;
        for (int i = 0; i < 20; i++){
            num = random.nextInt(0,101);
            System.out.println(num);
        }
        System.out.println("=================================================");
        for (int i = 0; i < 20; i++) {
            long l = random.nextLong();
            System.out.println(l);
        }
        System.out.println("=================================================");
        for (int i = 0; i < 20; i++) {
            double d = random.nextDouble(101);
            System.out.println(d);
        }

    }
}
