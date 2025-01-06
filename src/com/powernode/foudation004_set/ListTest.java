package com.powernode.foudation004_set;

import com.powernode.foudation003_list.Person;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        // 创建List集合
        List<Integer> nums = new ArrayList<>();

        // 添加元素
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(2);

        // 遍历结合
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }

        System.out.println("=================================================================");
        //创建存储String的 List集合
        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");

        // 在指定位置添加元素 add(下标，元素）
        str.add(0,"麻子");

        // 修改指定索引处的元素 set(下标,元素)
        str.set(6, "陈麻子");

        // 删除指定下标处的元素 remove(下标)
        str.remove(1);

        str.add("麻子");
        // 获取某个元素在集合中第一次出现的位置 indexOf()
        int index = str.indexOf("麻子");
        System.out.println("麻子在集合中第一次出现的位置为：" + index);

        // 获取某个元素最后一次出现在集合的位置 lastIndexOf()
        index = str.lastIndexOf("麻子");
        System.out.println("麻子在集合中最后一次出现的位置为：" + index);

        // 根据索引获取元素 get()
        System.out.println("str集合最后一个元素为：" + str.get(str.size() - 1));
        System.out.println("str集合倒数第二个元素为：" + str.get(str.size() - 2));

        // 将集合截取为一个新集合 subList()
        List<String> list1 = str.subList(str.size() - 3,str.size());
        System.out.println(list1);

        // 获取一个不可修改的集合，只读 of()
        List<String> list2 = List.of("麻子","麻子1","陈麻子","明东");
        System.out.println(list2);
        // UnsupportedOperationException
        // list2.set(0,"明东");

        System.out.println("=================================================================");
        List<String> strList = new ArrayList<>();
        strList.add("chengou");
        strList.add("mazi");
        strList.add("mingdong");
        strList.add("chenmazi");

        Iterator<String> it2 = strList.iterator();
        while(it2.hasNext()){
            String name = it2.next();
            System.out.println(name);
        }


        System.out.println("=================================================================");
        // List特有的迭代方式 listIterator
        ListIterator<String> lit = strList.listIterator();
        while(lit.hasNext()){
            String name = lit.next();
            System.out.println(name);
        }

        // NoSuchElementException
        System.out.println("=================================================================");
        // Variable 'lit' is not updated inside loop
        while(lit.hasPrevious()){
            String name = lit.previous();
            System.out.println(name);
        }

        while(lit.hasNext()){
            String name = lit.next();
            if("chengou".equals(name)){
                lit.add("麻子");
            }
        }
        System.out.println("=================================================================");
        System.out.println(strList);

        System.out.println(lit.previous());
        System.out.println(lit.previous());
        System.out.println(lit.previous());
        System.out.println(lit.previous());
        System.out.println(lit.previous());
        System.out.println(lit.previousIndex()); // -1 到顶了

        System.out.println("=================================================================");
        while(lit.hasNext()){
            String name = lit.next();
            if("chengou".equals(name)){
                System.out.println(lit.nextIndex());  // 返回的是下一个光标位置 1
                System.out.println(lit.previousIndex()); // 0
            }
        }
        // 光标上移
        while(lit.hasPrevious()){
            lit.previous();
        }

        System.out.println("=================================================================");
        System.out.println(lit.nextIndex());

        System.out.println("=================================================================");
        // set方法,修改当前next / previous 方法获取到的元素
        while(lit.hasNext()){
            String name = lit.next();
            if("chengou".equals(name)){
                lit.set("陈狗");
            }
        }
        // 光标上移
        while(lit.hasPrevious()){
            lit.previous();
        }
        System.out.println(strList);

        System.out.println("=================================================================");
        // remove 删除当前next / previous 方法获取到的元素
        while(lit.hasNext()){
            String name = lit.next();
            if("mazi".equals(name)){
                lit.remove();
            }
        }
        // 光标上移
        while(lit.hasPrevious()){
            lit.previous();
        }
        System.out.println(strList);

        //ListIterator ltor = strList.listIterator();

        // List接口使用Compartor排序
        User user1 = new User("麻子1" , 20);
        User user2 = new User("麻子2" , 21);
        User user3 = new User("麻子3" , 18);
        User user4 = new User("麻子4" , 22);
        User user5 = new User("麻子5" , 17);

        User[] users = {user1, user2, user3, user4, user5};

        // System.out.println(user1.age - user2.age);
        // 排序（自定义类的比较规则）
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        Person p1 = new Person("麻子5",16);
        Person p2 = new Person("麻子3",12);
        Person p3 = new Person("麻子4",21);
        Person p4 = new Person("麻子1",25);
        Person p5 = new Person("麻子2",21);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


        System.out.println("person数组排序前" + persons);
        // 排序？（提供比较器的规则）
        persons.sort(new PersonComparator());

        System.out.println(persons);

        // 匿名内部类排序规则
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println("匿名内部类比较规则" + persons);
    }
}
