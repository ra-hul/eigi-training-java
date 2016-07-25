package com.endurance.training.java.generics;

/**
 * Created by abhinav.v on 25/07/16.
 */
public class Pair<T>
{
    private T first;
    private T second;

    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    public void a1 ()
    {
        ListAlgorithms l = new ListAlgorithms();
    }
}
