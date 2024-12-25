package com.powernode.foudation004_set;

import com.powernode.foudation003_list.Person;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建第二个集合对象
        Collection c2 = new ArrayList();

        // 添加元素 add()
        c.add(1);
        c.add("abc");
        c.add(new Object());
        c.add(new Animal());
        c.add(false);

        c2.add("麻子");
        c2.add("陈狗");
        c2.add('2');
        Person p1 = new Person("明东", 23);
        c2.add(p1);

        c.addAll(c2);

        System.out.println(c);

        // 遍历
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("====================================================================");
        // 集合中的元素个数 size()
        System.out.println("集合中的元素个数：" + c.size());

        System.out.println("====================================================================");
        // 判断集合中是否有某个元素 contains() / containsAll()
        System.out.println(c.contains(p1));
        System.out.println(c.containsAll(c2));
        System.out.println(c.contains(50));

        System.out.println("====================================================================");
        // 将集合转换为数组
        Object[] objs = c.toArray();
        System.out.println(Arrays.toString(objs));

        System.out.println("====================================================================");
        // 创建日期对象
        Date d1 = new Date(1999,04,12);
        Date d2 = new Date(1999,05,12);
        c.add(d1);
        System.out.println(c.contains(d2));
        System.out.println(c);

        System.out.println("====================================================================");
        // 删除元素 remove();
        c.remove(d1);
        System.out.println(c);

        System.out.println("====================================================================");
        // 判断集合是否为空
        System.out.println(c.isEmpty());
        // 清空集合
        System.out.println(c2);
        c2.clear();
        System.out.println(c2.isEmpty());
    }
}
