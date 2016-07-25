package com.endurance.training.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhinav.v on 25/07/16.
 */
public class PairTest
{
    public static void main(String[] args)
    {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("abc");
        strings.add("xyz");
        strings.add("pqr");

        final Pair<String> aPair = ListAlgorithms.minMax(strings);
        System.out.println("Min: " + aPair.getFirst() + ", Max: " + aPair.getSecond());
    }
}

class ListAlgorithms
{
    public static Pair<String> minMax(List<String> strings)
    {
        if (strings == null || strings.isEmpty())
        {
            return null;
        }
        String min = strings.get(0);
        String max = strings.get(0);

        for (String string : strings)
        {
            if (min.compareTo(string) > 0)
            {
                min = string;
            }
            if (max.compareTo(string) < 0)
            {
                max = string;
            }
        }

        return new Pair<>(min, max);
    }
}