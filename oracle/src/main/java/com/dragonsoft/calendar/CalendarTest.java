package com.dragonsoft.calendar;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("DAY_OF_WEEK: "+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: "+cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("YEAR: "+cal.get(Calendar.YEAR));
        System.out.println("MONTH: "+cal.get(Calendar.MONTH));
        System.out.println("HOUR_OF_DAY : "+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE : "+cal.get(Calendar.MINUTE)); System.out.println("SECOND : "+cal.get(Calendar.SECOND));
    }
}
