package com.powernode.foudation004_set;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();

        vector.add("麻子");
        vector.add("麻子1");
        vector.add("麻子2");
        vector.add("麻子3");

        System.out.println(vector);
        System.out.println("=========================");
        System.out.println(vector.set(1,"陈麻子"));
        System.out.println("=========================");
        System.out.println(vector.get(1));
        System.out.println("=========================");

        ListIterator<String> lit = vector.listIterator();
        while(lit.hasNext()){
            String name = lit.next();
            System.out.println(name);
        }

        // 将光标移至第一位
        while(lit.hasPrevious()){
            lit.previous();
        }
        System.out.println("=========================");
        System.out.println(lit.next());
    }
}
