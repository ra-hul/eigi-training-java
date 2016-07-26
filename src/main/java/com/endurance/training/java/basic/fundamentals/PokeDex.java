package com.endurance.training.java.basic.fundamentals;

/**
 * Created by rahul.go on 25/07/16.
 */
public class PokeDex
{
    Pokemon pokemon3;
    private Trainer owner;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public PokeDex(Trainer owner)
    {
        this.owner = owner;
    }

    public static void main(String[] args)
    {
        Pokemon pikachu = new Pokemon("Pikachu", 1.5, new Integer(30), "Electric", 21, (int) 45.2);
        Pokemon raichu = new Pokemon("Raichu", 2.0, 35.5, "Electric", 42, 55);
        Pokemon squirtle = new Pokemon("Squirtle", 1.3, 38, "Water", 20, 35);
        Trainer owner = new Trainer("Abhinav", "L43");
        PokeDex pokeDex = new PokeDex(owner);
        pokeDex.setPokemon1(pikachu);
        pokeDex.setPokemon2(raichu);
        pokeDex.setPokemon3(squirtle);
        System.out.println("Credits: " + Pokemon.CREDITS + "\n\n");
        //pokeDex.updateWeight(40, pikachu);
        //pokeDex.swapPokemon(pikachu);
        pokeDex.dumpData();
    }

    public Pokemon getPokemon3()
    {
        return pokemon3;
    }

    public void setPokemon3(Pokemon pokemon3)
    {
        this.pokemon3 = pokemon3;
    }

    public Pokemon getPokemon2()
    {
        return pokemon2;
    }

    public void setPokemon2(Pokemon pokemon2)
    {
        this.pokemon2 = pokemon2;
    }

    public Pokemon getPokemon1()
    {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1)
    {
        this.pokemon1 = pokemon1;
    }

    public void dumpData()
    {
        this.owner.printDetails();
        printHeader();
        this.getPokemon1().printDetails();
        printHeader();
        this.pokemon2.printDetails();
        printHeader();
        this.getPokemon3().printDetails();
    }

    private void swapPokemon(Pokemon pokemon)
    {
        pokemon = new Pokemon("Charmander", 2.0, 25, "Fire", 22, 30);
    }

    private void printHeader()
    {
        System.out.println("\n**Poke Data**");
    }

    private void updateWeight(double weight, Pokemon pokemon)
    {
        pokemon.setWeight(weight);
    }
}
