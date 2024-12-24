package com.powernode.foudation003_list;

import java.util.*;

public class ArraysMethodTest {
    public static void main(String[] args) {
        // toString() 将数组对象转换为字符串
        int[] arr_1 = {1, 2, 3, 4, 5, 11, 22, 33, 44, 55};
        System.out.println(arr_1);
        System.out.println(Arrays.toString(arr_1));

        String[] names_1 = {"麻子", "陈狗", "明东"};
        // mplicit call to 'toString()' on array 'names_1'
        System.out.println(names_1);
        System.out.println(Arrays.toString(names_1));

        // Type may be primitive
        Integer i1 = 11;
        Integer i2 = 22;
        Integer i3 = 33;

        Integer[] arr_in = {i1, i2, i3};
        System.out.println(arr_in);
        System.out.println(Arrays.toString(arr_in));

        System.out.println("====================================================");

        // DeepToString() 将多维数组转换为字符串
        int[][] arr_deep = {
                {11, 22, 33},
                {111, 222, 333},
                {1111, 2222, 3333}
        };
        System.out.println(arr_deep);
        System.out.println(Arrays.toString(arr_deep));
        System.out.println(Arrays.deepToString(arr_deep));

        System.out.println("====================================================");

        // equals(); 判断两个数组是否相等
        int[] arr_2 = {11, 22, 33};
        int[] arr_3 = {33, 22, 11};
        System.out.println(Arrays.equals(arr_2, arr_3));
        System.out.println(arr_2 == arr_3);

        String[] name_2 = {"麻子", "陈狗"};
        String[] name_3 = {"麻子", "陈狗"};
        System.out.println(name_2 == name_3);
        System.out.println(Arrays.equals(name_2, name_3));

        System.out.println("====================================================");

        // sort(); 对数组进行排序
        Arrays.sort(name_2);
        System.out.println(Arrays.toString(name_2));
        Arrays.sort(arr_3);
        System.out.println(Arrays.toString(arr_3));
        String[] strs = {"z", "b", "e", "a", "x", "c"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        System.out.println("====================================================");

        // 自定义类的比较规则
        Person p1 = new Person("麻子1", 19);
        Person p2 = new Person("麻子2", 18);
        Person p3 = new Person("麻子3", 20);
        Person p4 = new Person("麻子4", 17);

        Person[] ps = {p1, p2, p3, p4};
        System.out.println(Arrays.toString(ps));
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));


        // 将一串数字转换为集合
        Collection list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 111, 222);
        // Raw use of parameterized class 'Iterator'
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object i = it.next();
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("=======================================================================================");

        List list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 7);
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i));
            System.out.print(", ");
        }

        System.out.println();
        System.out.println("=======================================================================================");

        // 数组拷贝,第二个参数为要拷贝的长度
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newarr = Arrays.copyOf(arr,arr.length);
        newarr[0] = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
        int[] newArr = Arrays.copyOfRange(arr,4,6);
        System.out.println(Arrays.toString(newArr));  // [5, 6]
        System.out.println("=======================================================================================");

        // 填充 fill
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 4);
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 1, 4, 412);
        System.out.println(Arrays.toString(arr1));
        System.out.println("=======================================================================================");


        // binarySearch 二分搜索查找数组
        int[] arr2 = {3, 5, 7, 9, 11, 13};
        System.out.println(Arrays.binarySearch(arr2,11));

        for (int i = 0; i < 15; i++) {
            System.out.println("数字[" + i + "] :" + Arrays.binarySearch(arr,1, 6, i)); // 不包含to
        }

        System.out.println("=======================================================================================");

        // 多核排序(parallelSort) 及 普通排序(sort)
        int[] arrSort = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < arrSort.length; i++) {
            int num = random.nextInt(1000000000);
            arrSort[i] = num;
        }
        // 当前毫秒数
        long begin = System.currentTimeMillis();
        // 普通排序
        // Arrays.sort(arrSort);  // 6432

        // 多核排序
        // Arrays.parallelSort(arrSort); // 776
        long end = System.currentTimeMillis();
        System.out.println((end - begin));

        System.out.println("=======================================================================================");

    }
}