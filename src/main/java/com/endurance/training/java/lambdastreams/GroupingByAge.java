package com.endurance.training.java.lambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by abhinav.v on 26/07/16.
 */
public class GroupingByAge
{
    public static void main(String[] args)
    {
        List<Person> persons =
                Arrays.asList(
                        new Person("Rahul", 26),
                        new Person("Jennifer", 23),
                        new Person("Abhinav", 26),
                        new Person("Dhanya ji", 30));

        final Map<Integer, List<Person>> personsGroupedByAge =
                persons
                        .stream()
                        .collect(Collectors.groupingBy(p -> p.age));

        // Many more types of Collectors...

        personsGroupedByAge.forEach((k, v) -> System.out.println("Age " + k + ": " + v));
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}