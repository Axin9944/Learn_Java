package com.powernode.foundation002;

import java.time.Instant;
import java.time.LocalDateTime;

public class LocalDateTest {
    public static void main(String[] args) {
        CalenderTest ct = new CalenderTest();
        ct.m1().m2().m3();

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime ldt = LocalDateTime.of(1999,4,12,12,12,12);
        System.out.println(ldt);

        LocalDateTime ldt2 = ldt.plusYears(1).plusMonths(2).plusDays(12).plusMinutes(12).plusHours(2).plusSeconds(12);
        System.out.println(ldt2);

        LocalDateTime ldt3 = ldt2.minusYears(1).minusMonths(1).minusDays(11).minusHours(1).minusMinutes(10).minusSeconds(10);
        System.out.println(ldt3);

        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfWeek().getValue());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());

        System.out.println("================================================");
        long l = System.currentTimeMillis();
        System.out.println(l);
        Instant now1 = Instant.now();
        System.out.println(now1);


    }
}
