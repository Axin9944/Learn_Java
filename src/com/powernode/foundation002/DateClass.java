package com.powernode.foundation002;

import java.util.Objects;

public class DateClass {
    //年
    private int year;
    //月
    private int month;
    //日
    private int day;

    public DateClass() {
    }

    public DateClass(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + " 年 " + month + " 月 " + day + " 日 ";
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateClass dateClass = (DateClass) o;
        return year == dateClass.year && month == dateClass.month && day == dateClass.day;
    }*/

    @Override
    public boolean equals(Object o) {
        if(null == o) return false;
        if(this == o) return true;
        if (o instanceof DateClass){
            DateClass d2 = (DateClass) o;
            return year == d2.year && month == d2.month && day == d2.day;
        }else return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(toString() + "已被回收");
    }
}
