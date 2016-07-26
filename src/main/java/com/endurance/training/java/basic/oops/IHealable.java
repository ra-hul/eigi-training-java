package com.endurance.training.java.basic.oops;

/**
 * Created by rahul.go on 25/07/16.
 */
public interface IHealable
{
    default void heal()
    {
        try
        {
            System.out.println("Putting Pokémon to sleep");
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Healing interrupted");
        }
    }
}
