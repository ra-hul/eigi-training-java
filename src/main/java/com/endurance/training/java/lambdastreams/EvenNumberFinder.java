package com.endurance.training.java.lambdastreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhinav.v on 26/07/16.
 */
public class EvenNumberFinder
{
    public static void main(String[] args)
    {
        List<Integer> integers = Arrays.asList(10, 1, 8, 2, 4, 5, 6);

        integers.forEach(i -> {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        });

        integers.forEach(System.out::println);
    }
}
