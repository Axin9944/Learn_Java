package com.powernode.foundation002;

public class BoxTest {
    public static void main(String[] args) {
        //最大值
        System.out.println("int类型的最大值:" + Integer.MAX_VALUE);
        System.out.println("double类型的最大值:" + Double.MAX_VALUE);
        System.out.println("byte类型的最大值:" + Byte.MAX_VALUE);
        System.out.println("short类型的最大值:" + Short.MAX_VALUE);
        System.out.println("long类型的最大值：" + Long.MAX_VALUE);
        System.out.println("float类型的最大值：" + Float.MAX_VALUE);
        System.out.println("======================================================");
        //最小值
        System.out.println("int类型的最小值：" + Integer.MIN_VALUE);
        System.out.println("double类型的最小值：" + Double.MIN_VALUE);
        System.out.println("byte类型的最小值：" + Byte.MIN_VALUE);
        System.out.println("short类型的最小值：" + Short.MIN_VALUE);
        System.out.println("long类型的最小值：" + Long.MIN_VALUE);
        System.out.println("float类型的最小值：" + Float.MIN_VALUE);

        //构造方法
        Byte b = 1;
        Short s = 2;
        Integer i = 128;
        //Type may be primitive
        Integer j = 128;
        int x = i;
        Long l = 100000L;
        Float f = 3.14f;
        Double d = 3.1415926;
        Character c = 'A';
        Boolean b1 = true;
        System.out.println(i + s);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(i == j);
        System.out.println(i.equals(j));

        Boolean flag = Boolean.valueOf("True");
        Boolean flag1 = Boolean.valueOf("True1");
        Integer int1 = Integer.valueOf("100");
        // Integer int2 = Integer.valueOf("100abc"); NumberFormatException
        System.out.println("========================================");

        //类型转换 Double
        //String --> double
        Double double1 = Double.valueOf("3.1415");
        String sd1 = double1.toString();
        String sd2 = String.valueOf(double1);
        System.out.println(sd1);
        System.out.println(sd2);
        System.out.println(sd1 == sd2);
        System.out.println(sd1.equals(sd2));
        double d1 = Double.parseDouble(sd1);
        System.out.println(d1 + 2);
        // double --> String
        String sd3 = String.valueOf("3.14159");
        System.out.println(sd3 + 3.14);

        // String --> Double
        Double dob1 = Double.valueOf("4.12");
        System.out.println(dob1 + 4.12);

        // Double --> String
        String sd4 = String.valueOf(dob1);
        System.out.println(sd4 + 4.12);

        // double --> Double
        Double dob2 = d1;
        System.out.println(dob2 + 4.12);

        // Double --> double
        d1 = dob2;

        System.out.println("=======================================================");
        // 类型转换 Integer
        // String --> int
        String s1 = "412";
        int n1 = Integer.parseInt(s1);
        System.out.println(n1 + 412);

        //int --> String
        int n2 = 214;
        String s2 = String.valueOf(n2);
        System.out.println(s2 + 412);

        //String --> Integer
        Integer in1 = Integer.valueOf(s1);
        System.out.println(in1 + 1999);
        /*Integer in2 = 412;
        System.out.println(in2 + 1999);*/

        //Integer --> String
        String s3 = String.valueOf(in1);
        System.out.println(s3 + 107);

        //Integer --> int
        //Unnecessary unboxing
        int n3 = in1.intValue();
        int n4 = in1;
        System.out.println(n3 + 172);

        //int --> Integer
        // Unnecessary boxing
        Integer in2 = Integer.valueOf(n4);
        Integer in3 = n4;




    }
}
