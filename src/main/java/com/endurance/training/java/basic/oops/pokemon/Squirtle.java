package com.endurance.training.java.basic.oops.pokemon;

import com.endurance.training.java.basic.oops.attacks.IAttack;
import com.endurance.training.java.basic.oops.attacks.ShellAttack;
import com.endurance.training.java.basic.oops.attacks.WaterGun;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Squirtle extends Pokemon
{
    private List<IAttack> attackList = new ArrayList<>();

    public Squirtle()
    {
        super(0.8, 35.5, "Water", 23, 44);
        attackList.add(new WaterGun());
        attackList.add(new ShellAttack());
    }

    @Override
    public List<IAttack> getAttacks()
    {
        return attackList;
    }

    @Override
    public String getName()
    {
        return "Squirtle";
    }

    @Override
    public String getSound()
    {
        return "Squi squi Squirtle";
    }
}
