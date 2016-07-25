package com.endurance.training.java.datetime;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by abhinav.v on 25/07/16.
 */
public class Comparison
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.print(date.getDay() + " ");
        System.out.print(date.getMonth() + " ");
        System.out.println(date.getYear());

        final LocalDateTime dateTime = LocalDateTime.now();
        System.out.print(dateTime.getDayOfMonth() + " ");
        System.out.print(dateTime.getMonth() + " ");
        System.out.println(dateTime.getYear());
    }
}
