package com.endurance.training.java.basic.oops;

import com.endurance.training.java.basic.oops.pokemon.Charmander;
import com.endurance.training.java.basic.oops.pokemon.Pikachu;
import com.endurance.training.java.basic.oops.pokemon.Pokemon;

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

        IAttacker attackingPokemon = pokémons.get(0);
        attackingPokemon.attack();
    }
}
