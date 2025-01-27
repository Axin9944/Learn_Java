package com.powernode.foudation004_set;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        // Type 'java.util.Properties' does not have type parameters
        Properties pro = new Properties();

        pro.setProperty("jdbc.diver", "com.mysql.jdbc.Driver");
        pro.setProperty("jdbc.url","jdbc://mysql");
        pro.setProperty("jdbc.user","root");
        pro.setProperty("jdbc.password","123456");

        pro.setProperty("key","value");
        String value = pro.getProperty("key");
        System.out.println(value);
        System.out.println(pro);

        // Raw use of parameterized class 'Enumeration'
        Enumeration<?> names = pro.propertyNames();
        while(names.hasMoreElements()){
            String name = (String)names.nextElement();
            System.out.println(name + ": " + pro.getProperty(name));
        }

        String diver = pro.getProperty("jdbc.diver");
        String user = pro.getProperty("jdbc.user");
        String password = pro.getProperty("jdbc.password");
        String url = pro.getProperty("jdbc.url");

        System.out.println(diver);
        System.out.println(user);
        System.out.println(password);
        System.out.println(url);

    }
}
