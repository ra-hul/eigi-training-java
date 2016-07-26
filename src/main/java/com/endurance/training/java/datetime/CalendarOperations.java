package com.endurance.training.java.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by abhinav.v on 26/07/16.
 */
public class CalendarOperations
{
    public static void main(String[] args)
    {

    }

    public static boolean isLeapYear(int year)
    {
        return Year.of(year).isLeap();
    }

    public static boolean isAfterNow(LocalDateTime time)
    {
        return time.isAfter(LocalDateTime.now());
    }

    public static Duration howLongTillNewYear()
    {
        LocalDateTime newYear = LocalDateTime.of(2017, Month.JANUARY, 1, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        return Duration.between(now, newYear);
    }

    public static Period howLongFromTheLongestDay()
    {
        final LocalDate now = LocalDate.now();
        final LocalDate of = LocalDate.of(2016, Month.JUNE, 21);
        return Period.between(of, now);
    }

    public static LocalDateTime getDateAfter100Years()
    {
        final LocalDateTime now = LocalDateTime.now();
        return now.plusYears(100);
    }

    private static void printDate(LocalDateTime localDateTime)
    {
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    private static void printDate(ZonedDateTime localDateTime)
    {
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
