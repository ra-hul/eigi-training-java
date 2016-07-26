package com.endurance.training.java.lambdastreams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by abhinav.v on 26/07/16.
 */
public class LastElement
{
    public static void main(String[] args)
    {
        final OptionalInt reduce = IntStream.range(0, 10)
                .reduce((a, b) -> b);
        System.out.println(reduce.getAsInt());
    }
}
