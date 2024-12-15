package com.powernode.foudation003_list;

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
        int[] nums10 = {100,200, 101, 999};
        System.out.println("nums10的最大值：" + searchMax(nums10));
        System.out.println("nums10的最大值的下标：" + searchMaxIndex(nums10));
        System.out.println("200在nums10的位置" + findIndexByElt(nums10, 200));

        System.out.println("======================================================================");
        int[] nums11 = {1000, 99999, 1000000, 999999, 100};
        System.out.println("nums11的最大值：" + searchMax(nums11));
        System.out.println("nums11的最大值的下标：" + searchMaxIndex(nums11));
        System.out.println("100在nums11的位置" + findIndexByElt(nums11, 100));
    }

    /*
        参数为数组的方法
    * */
    public static void display(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }

    // 获取数组最大值
    public static int searchMax(int[] arr){
        // 假设第一个是最大值
        int maxNumber = arr[0];
        // 遍历数组
        for (int num : arr){
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    // 获取数组最大值的第二种方式
    public static int maxNumber(int[] arr){
        // 假设第一个值为最大值
        int maxNumber = arr[0];
        // 遍历数组
        // Method call expected
        for (int i = 0; i <= arr.length - 1; i++){
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    // 获取数组最大值的下标
    public static int searchMaxIndex(int[] arr){
        // 假设第一个元素是最大值
        int maxIndex = 0;
        // 遍历数组
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 通过值找到其在数组第一次出现的位置
    public static int findIndexByElt(int[] arr, int elt){
        // 假设第一个就是要找的元素
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] == elt){
                index =  i;
            }
        }
        return index;
    }

}
