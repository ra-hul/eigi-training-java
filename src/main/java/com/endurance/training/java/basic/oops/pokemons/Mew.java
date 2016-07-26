package com.endurance.training.java.basic.oops.pokemons;

import com.endurance.training.java.basic.oops.attacks.IAttack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Mew extends Pokemon
{
    List<IAttack> attackList = new ArrayList<>();

    public Mew()
    {
        super(1, 22.6, "Psychic", 30, 45);
        attackList.add(new IAttack()
        {
            @Override
            public void doAttack()
            {
                System.out.println("«««««Flash≠≠≠≠««««");
            }

            @Override
            public List<String> getEffectiveAgainstTypes()
            {
                return Arrays.asList("Water", "Electric", "Fire", "Earth");
            }

            @Override
            public double getStaminaRequired()
            {
                return 2;
            }

            @Override
            public double getStrength()
            {
                return 95;
            }
        });
    }

    @Override
    public List<IAttack> getAttacks()
    {
        return attackList;
    }

    @Override
    public String getName()
    {
        return "Mew";
    }

    @Override
    public String getSound()
    {
        return "MEW... o.o";
    }
}
