package com.endurance.training.java.basic.pokedex;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Trainer
{
    private String name;
    private String level;

    public Trainer(String name, String level)
    {
        this.name = name;
        this.level = level;
    }
    public Trainer()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public void printDetails()
    {
        System.out.println("----Trainer---");
        System.out.println("Name:"+ name);
        System.out.println("Level:"+ getLevel());
        System.out.println("\n\n");
    }
}
