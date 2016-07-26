package com.endurance.training.java.basic.oops;

import com.endurance.training.java.basic.oops.pokemons.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class PokeSimulator
{
    public static void main(String[] args)
    {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pikachu());
        pokemons.add(new Charmander());
        pokemons.add(new Squirtle());
        pokemons.add(new Mew());

        IAttacker attackingPokemon = pokemons.get(0);
        attackingPokemon.attack();

        IHealable woundedPokemon = pokemons.get(1);
        woundedPokemon.heal();
        Pokemon pokemon = pokemons.get(3);
        pokemon.getTradeMetrics().printDetails();
        System.out.println(pokemon.getSound());
    }
}
