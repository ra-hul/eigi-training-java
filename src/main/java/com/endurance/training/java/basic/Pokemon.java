package com.endurance.training.java.basic;

public class Pokemon
{

    public static void main(String[] args)
    {
        String name = null;

        if (args.length >= 1)
        {
            name = args[0];
        }
        new Pokemon().sayHello(name);
    }

    public void sayHello(String name)
    {
        if (name == null)
        {
            System.out.println("Pika Pika :(");
        }
        else
        {
            System.out.println("Pika Pika Pikachu: " + name);
        }
    }
}
