package com.endurance.training.java.basic;

public class Pikachu
{

    public static void main(String[] args)
    {
        String name = null;

        if (args.length >= 1)
        {
            name = args[0];
        }
        new Pikachu().sayHello(name);
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
