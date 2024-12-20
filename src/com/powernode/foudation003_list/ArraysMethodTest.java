package com.powernode.foudation003_list;

import java.util.*;

public class ArraysMethodTest {
    public static void main(String[] args) {
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
