package com.endurance.training.java.basic.oops;

import com.endurance.training.java.basic.oops.pokemons.Pikachu;
import com.endurance.training.java.basic.oops.pokemons.Pokemon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rahul.go on 25/07/16.
 */
public class ReflectionSimulator
{

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Pokemon pikachu = new Pikachu();
        Method m = Pokemon.class.getDeclaredMethod("computeScore");
        m.setAccessible(true);
        System.out.println(m.invoke(pikachu));
    }
}
