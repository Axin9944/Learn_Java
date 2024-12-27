package com.powernode.foudation004_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SequencedCollection;

public class SequencedCollectionTest {
    public static void main(String[] args) {
        // 创建SequencedCollention 集合
        SequencedCollection sc = new ArrayList();

        // 添加元素
        sc.add(1);
        sc.add(2);
        sc.add(3);
        sc.add(4);

        // 相头部添加元素 addFirst
        sc.addFirst(0);
        sc.addFirst("麻子");

        // 向尾部添加元素 addLast
        sc.addLast(5);
        sc.addLast("陈麻子");

        System.out.println(sc);

        System.out.println("==========================================================");
        // 遍历集合
        Iterator it = sc.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("==========================================================");
        // 获取集合中的第一个元素 getFirst()
        System.out.println(sc.getFirst());

        // 获取集合中的最后一个元素 getLast()
        System.out.println(sc.getLast());

        System.out.println("==========================================================");
        // 反转整个集合
        SequencedCollection resversc = sc.reversed();
        it = resversc.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("==========================================================");
        // 删除集合第一个元素 removeFirst()
        resversc.removeFirst();

        // 删除集合中最后一个元素 removeLast()
        resversc.removeLast();

        it = resversc.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
