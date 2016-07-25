package com.endurance.training.java.basic.oops.pokemon;

import com.endurance.training.java.basic.oops.IAttacker;
import com.endurance.training.java.basic.oops.IHealable;
import com.endurance.training.java.basic.oops.attacks.IAttack;

import java.util.List;
import java.util.Random;

/**
 * Created by rahul.go on 25/07/16.
 */
public abstract class Pokemon implements IHealable, IAttacker
{
    protected double height;
    protected double weight;
    protected String type;
    protected int combatPower;
    protected int hitPoints;
    protected int health;

    public Pokemon(double height, double weight, String type, int combatPower, int hitPoints)
    {
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.combatPower = combatPower;
        this.hitPoints = hitPoints;
        this.health = hitPoints;
    }

    public void printDetails()
    {
        System.out.println("Name:" + getName());
        System.out.println("Type:" + type);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("CP:" + combatPower);
        System.out.println("HP:" + hitPoints);
        System.out.println("Score:" + computeScore());
        System.out.println("Health:" + health);
    }

    private Double computeScore()
    {
        Double score = Math.sqrt(combatPower * combatPower + hitPoints * hitPoints);
        return (double) Math.round(score);
    }

    public void heal()
    {
        IHealable.super.heal();
        health = hitPoints;
    }

    public void attack()
    {
        getAttacks().get(new Random().nextInt(getAttacks().size())).doAttack();
    }

    public abstract List<IAttack> getAttacks();

    public abstract String getName();

    public abstract String getSound();
}
