package com.powernode.foudation004_set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        //Type 'com.powernode.foudation004_set.LinkedList' does not have type parameters
        LinkedList<String> ll = new LinkedList<>();
        /*ArrayList<Integer> al = new ArrayList<>();*/
        ll.add("麻子");
        ll.add("麻子1");
        ll.add("麻子2");
        ll.add("麻子3");

        /*al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);*/

        System.out.println(ll);
        System.out.println("======================");
        ll.set(0,"mazi");
        System.out.println("======================");
        System.out.println(ll.get(0));
        System.out.println("======================");

        for(int i = 0; i < ll.size(); i++){
            System.out.println(ll.get(i));
        }
        System.out.println("======================");

        ListIterator<String> lit = ll.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        while(lit.hasPrevious()){
            lit.previous();
        }
        System.out.println(lit.next());
    }
}
