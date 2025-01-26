package com.powernode.foudation004_set;

import java.util.*;

public class HashtableTest {
    public static void main(String[] args) {
        // 创建hashtabel 集合
        Hashtable<String, User> userHashTable = new Hashtable<>();

        // 添加元素
        User u1 = new User("麻子" , 17);
        User u2 = new User("陈麻子" , 23);
        User u3 = new User("明东" , 22);
        User u4 = new User("陈狗" , 18);

        userHashTable.put("1", u1);
        userHashTable.put("2", u2);
        userHashTable.put("3", u3);
        userHashTable.put("4", u4);

        System.out.println(userHashTable);

        // 遍历所有 key
        Enumeration<String> keys = userHashTable.keys();
        while(keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }

        // 遍历所有 value
        Enumeration<User> values = userHashTable.elements();
        while(values.hasMoreElements()){
            System.out.println(values.nextElement());
        }

        // 遍历
        Set<Map.Entry<String, User>> entry = userHashTable.entrySet();
        for(Map.Entry<String, User> entr : entry){
            System.out.println(entr.getKey() + ": " + entr.getValue());
        }

    }
}
