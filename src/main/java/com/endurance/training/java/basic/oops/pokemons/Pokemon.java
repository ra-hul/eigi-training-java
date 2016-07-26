package com.endurance.training.java.basic.oops.pokemons;

import com.endurance.training.java.basic.oops.IAttacker;
import com.endurance.training.java.basic.oops.IDisplayable;
import com.endurance.training.java.basic.oops.IHealable;
import com.endurance.training.java.basic.oops.attacks.IAttack;

import java.util.List;
import java.util.Random;

/**
 * Created by rahul.go on 25/07/16.
 */
public abstract class Pokemon implements IHealable, IAttacker, IDisplayable
{
    protected PokeDataBean pokeData;

    public Pokemon(double height, double weight, String type, int combatPower, int hitPoints)
    {
        this.pokeData = new PokeDataBean(height, weight, type, combatPower, hitPoints, getName());
    }

    public void printDetails()
    {
        pokeData.printDetails();
    }

    private Double computeScore()
    {
        Double score = Math.sqrt(Math.pow(pokeData.getCombatPower(), 2) + Math.pow(pokeData.getHitPoints(), 2));
        return (double) Math.round(score);
    }

    public void heal()
    {
        IHealable.super.heal();
        pokeData.setHealth(pokeData.getHitPoints());
    }

    public void attack()
    {
        getAttacks().get(new Random().nextInt(getAttacks().size())).doAttack();
    }

    public abstract List<IAttack> getAttacks();

    public abstract String getName();

    public abstract String getSound();

    public TradeMetrics getTradeMetrics()
    {
        return new TradeMetrics(pokeData.hitPoints, pokeData.type, computeScore(), getName());
    }

    public static class TradeMetrics implements IDisplayable
    {
        private double hitPoints;
        private String type;
        private double score;
        private String name;


        public TradeMetrics(double hitPoints, String type, double score, String name)
        {
            this.hitPoints = hitPoints;
            this.type = type;
            this.score = score;
            this.name = name;
        }

        @Override
        public void printDetails()
        {
            System.out.println("««Trade Details«««");
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);
            System.out.println("HP: " + hitPoints);
            System.out.println("Score: " + score);
            System.out.println("«««««««««««««««««");
        }
    }

    private class PokeDataBean implements IDisplayable
    {
        protected String name;
        protected double height;
        protected double weight;
        protected String type;
        protected int combatPower;
        protected int hitPoints;
        protected int health;

        public PokeDataBean(double height, double weight, String type, int combatPower, int hitPoints, String name)
        {
            this.height = height;
            this.weight = weight;
            this.type = type;
            this.combatPower = combatPower;
            this.hitPoints = hitPoints;
            this.health = hitPoints;
            this.name = name;

        }

        public int getHitPoints()
        {
            return hitPoints;
        }

        private int getCombatPower()
        {
            return combatPower;
        }

        private void setHealth(int health)
        {
            this.health = health;
        }

        public void printDetails()
        {
            System.out.println("Name:" + name);
            System.out.println("Type:" + type);
            System.out.println("Height:" + height);
            System.out.println("Weight:" + weight);
            System.out.println("CP:" + combatPower);
            System.out.println("HP:" + hitPoints);
            System.out.println("Score:" + computeScore());
            System.out.println("Health:" + health);
        }
    }
}
