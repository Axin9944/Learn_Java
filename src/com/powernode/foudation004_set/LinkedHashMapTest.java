package com.powernode.foudation004_set;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, User> lhm = new LinkedHashMap<>();
        User u1 = new User("麻子",18);
        User u2 = new User("麻子1",19);
        User u3 = new User("麻子2",20);

        lhm.put("1",u1);
        lhm.put("2",u2);
        lhm.put("3",u3);
        System.out.println(lhm);
        Set<Map.Entry<String, User>> lhmito = lhm.entrySet();
        for(Map.Entry<String, User> entry : lhmito){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
