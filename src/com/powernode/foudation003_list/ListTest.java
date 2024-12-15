package com.powernode.foudation003_list;

import java.util.Arrays;

public class ListTest {

    public static void main(String[] args) {
        // 初始化一维数组
        int[] arr = new int[] {1, 2, 4, 5, 6, 55};
        String[] names = new String[] {"麻子1", "麻子2", "麻子3"};

        // c / c++的风格
        int nums[] = new int[] {100,200,111};

        // 静态初始化一维数组的第二种方式：省略 new
        int[] nums2 = {200,205,300};
        String[] names2 = {"陈狗1","陈狗2","陈狗3"};

        // 读取 nums2 中的每一个值
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);
        System.out.println(nums2[2]);

        // 修改nums中的每一个值
        nums2[0] = 201;
        nums2[1] = 2010;
        nums2[0] = 2030;
        System.out.println("======================================================================");
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);
        System.out.println(nums2[2]);

        System.out.println("======================================================================");
        /*
        *   for each 语法
        * */
        for (int num : nums2){
            System.out.println(num);
        }
        System.out.println("======================================================================");
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("======================================================================");

        /*
        *  动态初始化一维数组
        * */
        int[] nums3 = new int[5];
        for (int num : nums3){
            System.out.println(num);
        }
        String[] name3 = new String[5];
        for (String num : name3){
            System.out.println(num);
        }
        System.out.println("======================================================================");
        display(nums);
        System.out.println("======================================================================");
        display(arr);


        System.out.println("======================================================================");
        /*
        *  数组的多态
        * */

        // com.powernode.foudation003_list.ListTest.this' cannot be referenced from a static context
        Object a = new A();
        Object b = new B();
        Object[] objs = new Object[] {a,b};

        Bird bird = new Bird();
        Cat cat = new Cat();
        // 创建一个数组，即能存储Cat，又能存储Bird
        // 数组中存储的不是对象本身，实际上是对象在内存中的地址，存储的是引用
        Animal[] animals = {bird, cat, new Cat(), new Bird()};
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat c = (Cat) animal;
                c.cathMouse();
            }else {
                Bird b1 = (Bird) animal;
                b1.fly();
            }
        }

        System.out.println("======================================================================");
        int[] nums12 = {100, 25, 44, 3};
        reverse(nums12);
        System.out.println(Arrays.toString(nums12));

        System.out.println("======================================================================");
        int[] nums13 = {999, 22, 33, 1, 2};
        System.out.println(Arrays.toString(nums13));
        reverse2(nums13);
        System.out.println("nums11反转后：" + Arrays.toString(nums13));

        System.out.println("================================数组扩容====================================");
        int[] nusm14 = {1, 2, 3, 4, 5, 6, 999};
        System.out.println(Arrays.toString(nusm14));
        nusm14 = kuoArr(nusm14);
        System.out.println("扩容后：" + Arrays.toString(nusm14));
    }

    /*
        参数为数组的方法
    * */
    public static void display(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }

    // 反转数组：
    // 创建一个新数组，旧数组从右向左存至新数组，旧数组与新数组交换
    public static void reverse(int[] arr){
        // 创建新数组接受旧数组的数据
        int[] newArr = new int[arr.length];
        // 将原数组从右向左传入新数组
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < newArr.length; i++){
            arr[i] = newArr[i];
        }
    }
    // 反转数组的第二种方式
    // 首尾互换位置
    public static void reverse2(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 对数组进行扩容
    public static int[] kuoArr(int[] arr){
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
