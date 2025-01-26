package com.powernode.foudation004_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*   存放在HashMap集合key部分的元素必须同时重写hashCode + equals方法。
*   equals返回true时，hashCode必须相同
* */
public class HashMapTest {
    public static void main(String[] args) {
        // 创建HashMap集合
        Map<String, String> hashm = new HashMap<>();

        // 添加键值对
        hashm.put("1", "麻子");
        hashm.put("2", "陈麻子");
        hashm.put("3", "麻子2");
        hashm.put("4", "麻子3");



        User u1 = new User("麻子", 1);
        User u2 = new User("麻子", 1);
        User u3 = new User("陈麻子", 22);
        User u4 = new User("明东", 23);

        System.out.println(u1.hashCode());  // 1283061

        Map<User, Integer> userMap = new HashMap<>();
        userMap.put(u1, 1);
        userMap.put(u2, 2);
        userMap.put(u3, 3);
        userMap.put(u4, 4);

        // HashMap的key 可以是null
        hashm.put(null, "麻子1");

        System.out.println(hashm);
        System.out.println(userMap);

        // 遍历
        Set<Map.Entry<String, String>> entries = hashm.entrySet();
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<Map.Entry<User, Integer>> umIto = userMap.entrySet();
        for(Map.Entry<User, Integer> entry : umIto){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /*
        *   HashMap的容量是2的次幂， hash & (length - 1) 与 hash % length 结果相同
        * */
        System.out.println(1283601 & 15);  // 1
        System.out.println(1283601 % 16);  // 1
        System.out.println(1283601 % 32);  // 17
        System.out.println(1283601 & 31);  // 17

    }
}
