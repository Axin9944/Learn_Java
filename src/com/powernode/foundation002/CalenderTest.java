package com.powernode.foundation002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {

    public CalenderTest  m1(){
        System.out.println("m1.........");
        return this;
    }

    public CalenderTest  m2(){
        System.out.println("m2.........");
        return this;
    }
    public CalenderTest  m3(){
        System.out.println("m3.........");
        return this;
    }

    public static void main(String[] args) {
        String s = "2024-11-10 23:04:59 404";
        long l = System.currentTimeMillis();
        System.out.println(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s1 = sdf.format(l);
        System.out.println(s1);

        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1000);
        System.out.println(date1);

        Date date2 = new Date(l - 1000 * 60 * 10);
        System.out.println(sdf.format(date2));

        Date date3 = null;
        try {
            date3 = sdf.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date3);

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        /*int year = Calendar.YEAR;
        System.out.println(year);
        System.out.println(Calendar.MONTH);*/
        System.out.println("年份：" + c.get(Calendar.YEAR));
        System.out.println("月份：" + (c.get(Calendar.MONTH) + 1));
        System.out.println("本月的第几天：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("本年的第几天：" + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("今天的第几个小时（24）：" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("今天的第几个小时（12）：" + c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println("本周的第几天：" + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("=========================================================");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,1999);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DAY_OF_MONTH,12);
        System.out.println(cal.get(Calendar.YEAR) + "年 " + (cal.get(Calendar.MONTH) + 1) + "月 " + cal.get(Calendar.DAY_OF_MONTH) + "日");

        cal.set(1999,Calendar.APRIL,12,12,12,12);
        System.out.println(cal.get(Calendar.YEAR) + "年 " + (cal.get(Calendar.MONTH) + 1) + "月 " + cal.get(Calendar.DAY_OF_MONTH) + "日");

        cal.add(Calendar.YEAR,2);
        System.out.println(cal.get(Calendar.YEAR) + "年 " + (cal.get(Calendar.MONTH) + 1) + "月 " + cal.get(Calendar.DAY_OF_MONTH) + "日");

        cal.add(Calendar.MONTH,2);
        System.out.println(cal.get(Calendar.YEAR) + "年 " + (cal.get(Calendar.MONTH) + 1) + "月 " + cal.get(Calendar.DAY_OF_MONTH) + "日");

        Date date4 = null;
        try{
            date4 = sdf.parse(s);
        }catch (ParseException e){
            throw new RuntimeException(e);
        }
        cal.setTime(date4);
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        cal.set(Calendar.SECOND,0);
        Date time = cal.getTime();
        String s2 = sdf.format(time);
        System.out.println(s2);
    }
}
