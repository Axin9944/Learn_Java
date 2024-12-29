package com.powernode.foudation004_set;

import com.powernode.foudation003_list.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericityTest {
    public static void main(String[] args) {
        // 没有使用泛型的集合
        Collection c = new ArrayList();

        Person p1 = new Person("麻子1", 22);
        Person p2 = new Person("麻子2", 23);
        Person p3 = new Person("麻子3", 24);
        Person p4 = new Person("麻子4", 25);
        Person p5 = new Person("麻子5", 26);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);

        // 没有使用泛型的集合的遍历
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();

            // 调用私有方法需要向下转型
            Person person = (Person) obj;
            person.pay();
        }

        System.out.println("=================================================================");
        // 使用泛型机制的集合
        Collection<Person> c1 = new ArrayList();
        c1.add(p1);
        c1.add(p2);
        c1.add(p3);
        c1.add(p4);
        c1.add(p5);
        Iterator<Person> it1 = c1.iterator();
        while(it1.hasNext()){
            Person person = it1.next();
            person.pay();
        }

        // java: 不兼容的类型: int无法转换为com.powernode.foudation003_list.Person
        // c1.add(1);

        System.out.println("=================================================================");
        Collection<String> strs = new ArrayList();
        strs.add("陈狗1");
        strs.add("陈狗2");
        strs.add("陈狗3");
        strs.add("陈狗4");
        strs.add("陈狗5");
        Iterator<String> strIt = strs.iterator();
        while(strIt.hasNext()){
            String str = strIt.next();
            System.out.println(str.charAt(1));
        }

        System.out.println("=========================类上定义泛型========================================");
        MyClass<String> myClass = new MyClass<>("麻子");
        System.out.println(myClass);

        Vip<String, Integer> vip1 = new Vip<>("麻子1", 22);
        System.out.println(vip1);
        // java: 不兼容的类型: 无法推断com.powernode.foudation004_set.Vip<>的类型参数
        //    原因: 推论变量 AgeType 具有不兼容的上限
        //      等式约束条件：java.lang.Integer
        //      下限：java.lang.String
        // Vip<String, Integer> vip2 = new Vip<>("麻子2", "22");

        System.out.println("==========================泛型通配符=======================================");
        // ? 任意类型的数据
        print(new ArrayList<String>());
        print(new ArrayList<Integer>());
        print(new ArrayList<Double>());

        // 上限通配符
        print2(new ArrayList<Number>());
        print2(new ArrayList<Integer>());
        print2(new ArrayList<Byte>());
        // java: 不兼容的类型: java.util.ArrayList<java.lang.String>
        //                      无法转换为java.util.ArrayList<? extends java.lang.Number>
        // print2(new ArrayList<String>());

        // 下限通配符
        print3(new ArrayList<String>());
        print3(new ArrayList<Object>());

    }
    // ? 任意类型的数据
    public static void print(ArrayList<?> list){}

    // 上限通配符 ? extends xxxx   xxxx及其子类类型的数据
    public static void print2(ArrayList<? extends Number> list){}

    // 下限通配符 ? super xxxx   xxxx及其父类类型的数据
    public static void print3(ArrayList<? super String> list){}
}