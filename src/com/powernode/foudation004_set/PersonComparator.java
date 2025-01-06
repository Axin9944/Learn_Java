package com.powernode.foudation004_set;

import com.powernode.foudation003_list.Person;

import java.util.Comparator;

/*
*   比较Person 的比较器
* */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // 按照姓名排序
        return o1.getName().compareTo(o2.getName());
    }
}
