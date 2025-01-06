package com.powernode.foudation004_set;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 创建ArrayList集合
        List<String> names = new ArrayList<>();
        // 添加元素
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");
        names.add("麻子1");


        // set修改集合中指定下表的元素
        String name = names.set(1,"mazi2");
        System.out.println(name);

        // 插入元素
        names.add(1,"陈麻子");

        // 删除指定下标的元素
        names.remove(0);

        System.out.println(names);
    }
}
