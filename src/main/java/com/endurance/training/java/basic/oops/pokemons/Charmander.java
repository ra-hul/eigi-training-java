package com.endurance.training.java.basic.oops.pokemons;

import com.endurance.training.java.basic.oops.attacks.Flamethrower;
import com.endurance.training.java.basic.oops.attacks.IAttack;
import com.endurance.training.java.basic.oops.attacks.IronTail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Charmander extends Pokemon
{
    private List<IAttack> attackList = new ArrayList<>();

    public Charmander()
    {
        super(0.8, 35.5, "Fire", 23, 44);
        attackList.add(new Flamethrower());
        attackList.add(new IronTail());
    }

    @Override
    public List<IAttack> getAttacks()
    {
        return attackList;
    }

    @Override
    public String getName()
    {
        return "Charmander";
    }

    @Override
    public String getSound()
    {
        return "Char Charr...";
    }
}
