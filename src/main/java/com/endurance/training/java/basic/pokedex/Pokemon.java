package com.endurance.training.java.basic.pokedex;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Pokemon
{
    private String name;
    private double height;
    private double weight;
    private String type;
    private int combatPower;
    private int hitPoints;
    public static final String CREDITS = "Nintendo";
    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public Pokemon(String name, double height, double weight, String type, int combatPower, int hitPoints)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.combatPower = combatPower;
        this.hitPoints = hitPoints;
    }

    public void printDetails()
    {
        System.out.println("Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("CP:" + combatPower);
        System.out.println("HP:" + hitPoints);
        System.out.println("Score:" + getScore());
    }

    private Double getScore()
    {
        Double score = Math.sqrt(combatPower * combatPower + hitPoints * hitPoints);
        return (double) Math.round(score);
    }
}
