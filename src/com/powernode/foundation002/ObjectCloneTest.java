package com.powernode.foundation002;

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address gui = new Address("贵州", "贵阳", "1101");
        User mingDong = new User("麻子", 20, gui);
        Object obj = mingDong.clone();
        User m2 = (User)obj;

        /*
            浅克隆：
        * User{name='麻子', age=20, add=Address{province='贵州', city='贵阳', district='1101'}}
           User{name='麻子', age=20, add=Address{province='四川', city='贵阳', district='1101'}}
            User{name='麻子', age=20, add=Address{province='四川', city='贵阳', district='1101'}}

            深克隆：
            User{name='麻子', age=20, add=Address{province='贵州', city='贵阳', district='1101'}}
            User{name='明东', age=20, add=Address{province='四川', city='贵阳', district='1101'}}
            User{name='麻子', age=20, add=Address{province='贵州', city='贵阳', district='1101'}}
        * */
        System.out.println(m2);
        m2.getAdd().setProvince("四川");
        m2.setName("明东");
        System.out.println(m2);
        System.out.println(mingDong);

    }
}
