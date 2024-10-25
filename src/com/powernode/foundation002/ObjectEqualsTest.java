package com.powernode.foundation002;

/*
* Object 的 equals方法测试
* Object 类中的equals 方法

    1、equals 方法的作用是： 判断两个对象是否相等。
       equals 方法的返回值是: true / false
       true 代表两个对象相等
       false 代表两个对象不相等

    2、Object 中的 equals 方法的默认实现是：
        public boolean equals(Object obj){
            return (this == obj);
        }
        a.equals(b) 表面是 a 和 b 的比较，实际上方法体当中是 this 和 obj 的比较

    3、equals 方法重写：
        因为 Object 类中的equals 方法在进行比较的时候，比较的是两个 java 对象的内存地址
        我们希望比较的是对象的内容，只要对象内容相同，则认为是相同
*
* */
public class ObjectEqualsTest {
    public static void main(String[] args) {
        DateClass date2 = new DateClass(1999,04,12);
        DateClass date3 = new DateClass(1999,04,12);
        System.out.println(date2.equals(date3));
        System.out.println(date2.getClass());
        System.out.println(date3.getClass());
        System.out.println(date2 == date3);
    }

}
