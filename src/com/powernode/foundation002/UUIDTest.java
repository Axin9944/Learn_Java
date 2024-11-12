package com.powernode.foundation002;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.randomUUID();
        UUID uuid4 = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid2);
        System.out.println(uuid3);
        System.out.println(uuid4);
        String s = uuid.toString();
        System.out.println(s);
        String s1 = s.replace("-","").toUpperCase();
        System.out.println(s1);
    }
}
