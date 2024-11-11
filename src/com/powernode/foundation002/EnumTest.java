package com.powernode.foundation002;

public class EnumTest {
    public static void main(String[] args) {
        Gender gender = Gender.WOMAN;
        switch (gender){
            case MAN -> System.out.println("性别为男。");
            case WOMAN -> System.out.println("性别为女。");}

        User2 user1 = new User2("Alice", 28, Sex.FEMALE);
        User2 user2 = new User2("Bob", 35, Sex.MALE);

        System.out.println(user1);
        System.out.println(user2);

        user2.setGender(Sex.FEMALE);
        System.out.println(user2);
    }
}

enum Gender{
    //MALE("Male"),
    //    FEMALE("Female");
    MAN, WOMAN
}

enum Sex{
    //Expected 0 arguments but found 1
    MALE("男性"), FEMALE("女性");

    private String displayName;

    Sex(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

class User2 {
    private String name;
    private int age;
    private Sex gender;

    public User2(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        // Non-static method 'getDisplayName()' cannot be referenced from a static context
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", 性别=" + gender.getDisplayName() +
                '}';
    }
}
