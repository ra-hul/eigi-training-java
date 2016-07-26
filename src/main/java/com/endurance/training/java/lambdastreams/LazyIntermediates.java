package com.endurance.training.java.lambdastreams;

import java.util.stream.IntStream;

/**
 * Created by abhinav.v on 26/07/16.
 */
public class LazyIntermediates
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Start the show!");

        final IntStream intStream = IntStream.range(0, 10).filter(n -> {
            System.out.println("filter for " + n);
            return n % 2 == 0;
        }).map(n -> {
            System.out.println("mapping " + n);
            return n * 10;
        });

        System.out.println("All the Filtering and Mapping done!");
        System.out.println("Let's go for a nap...");

        Thread.sleep(5000);

        intStream.forEach(System.out::println);
    }
}
