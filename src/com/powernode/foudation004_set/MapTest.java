package com.powernode.foudation004_set;

import java.util.*;

// com.powernode.foudation004_set.MapTest
public class MapTest {
    public static void main(String[] args) {
        // 创建Map集合
        Map<Integer, String> dist = new HashMap<>();

        // 添加键值对
        dist.put(1, "麻子");
        dist.put(2, "麻子2");
        dist.put(3, "麻子3");

        System.out.println(dist);
        System.out.println("dist的键值对数量" + dist.size());

        // 创建第二个Map集合
        Map<Integer, String> map = new HashMap<>();
        map.put(121, "陈麻子");

        // 将一个Map集合放入另一个Map集合中
        map.putAll(dist);
        System.out.println(map);

        // 通过key获取value
        System.out.println(map.get(121));

        // 输入不存在的key
        System.out.println(map.get(111)); // null

        // 判断集合中是否包含某个key
        System.out.println(map.containsKey(111));
        System.out.println(map.containsKey(121));

        // 判断集合中是否包含某个value
        System.out.println(map.containsValue("麻子"));
        System.out.println(map.containsValue("明东"));

        // 清空集合
        dist.clear();
        System.out.println(dist.isEmpty());

        // 通过key，删除整个key-value对
        map.remove(2);
        System.out.println(map);

        // 获取所有的value
        Collection<String> values = map.values();
        System.out.println(values);

        // 获取所有的key
        Collection<Integer> keys = map.keySet();
        System.out.println(keys);

        // for - each 迭代集合
        for (String value : values) {
            System.out.println(value);
        }

        // 静态方法of
        Map<Integer, String> map2 = Map.of(1, "麻子1", 2, "麻子2", 3, "麻子3", 4, "麻子4");
        System.out.println(map2);
        System.out.println("=================================================================================");
        // 遍历集合
        Set<Integer> keys2 = map2.keySet();
        Iterator<Integer> ito = keys2.iterator();
        while (ito.hasNext()) {
            Integer key = ito.next();
            String value = map2.get(key);
            System.out.println(value);
        }

        System.out.println("=================================================================================");
        // for - each 方法
        for(Integer key : keys2){
            System.out.println(key + " : " + map2.get(key));
        }

        System.out.println("=================================================================================");
        // Map Entry 方法
        Set<Map.Entry<Integer, String>> entries = map2.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<Integer, String>> mapito = entries.iterator();
        while(mapito.hasNext()){
            Map.Entry<Integer,String> entry = mapito.next();
            Integer key = entry.getKey();
            String vbalue = entry.getValue();
            System.out.println(key + " : " + vbalue);
        }

        System.out.println("=================================================================================");
        // for - each
        for(Map.Entry<Integer, String> entry : map2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
