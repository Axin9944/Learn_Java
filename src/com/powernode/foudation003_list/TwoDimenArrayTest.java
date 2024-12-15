package com.powernode.foudation003_list;

import java.util.Arrays;

public class TwoDimenArrayTest {
    public static void main(String[] args) {
        // 静态初始化一维数组
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 20, 100}
        };
        System.out.println("该二维数组有：" + arr.length + " 个一维数组");

        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

        // 二维数组中第一个一维数组的第一个元素
        int[] arr0 = arr[0];
        int arr00 = arr0[0];
        // 合并以上两部
        int arr000 = arr[0][0];
        System.out.println("二维数组arr中第一个一维数组中的第一个元素为：" + arr000);

        // 二维数组中的最后一个元素
        System.out.println("二维数组arr中最后一个一维数组中的最后一个元素为: " + arr[arr.length - 1][arr[arr.length - 1].length - 1]);

        // 动态初始化二维数组
        int[][] arr2 = new int[3][4];

        // 遍历二维数组
        for (int i = 0; i < arr2.length; i++) {
            // 遍历二维数组中的第一个数组
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] array : arr2){
            System.out.println(Arrays.toString(array));
        }
    }
}
