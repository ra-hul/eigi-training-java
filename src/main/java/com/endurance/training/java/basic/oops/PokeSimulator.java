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
        List<Pokemon> pokémons = new ArrayList<>();
        pokémons.add(new Pikachu());
        pokémons.add(new Charmander());
        pokémons.add(new Squirtle());
        pokémons.add(new Mew());

        IAttacker attackingPokemon = pokémons.get(0);
        attackingPokemon.attack();

        IHealable woundedPokemon = pokémons.get(1);
        woundedPokemon.heal();
        Pokemon pokemon = pokémons.get(3);
        pokemon.getTradeMetrics().printDetails();
        System.out.println(pokemon.getSound());
    }
}
