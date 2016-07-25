package com.endurance.training.java.basic.oops.pokemon;

import com.endurance.training.java.basic.oops.attacks.IAttack;
import com.endurance.training.java.basic.oops.attacks.IronTail;
import com.endurance.training.java.basic.oops.attacks.ThunderBolt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Pikachu extends Pokemon
{
    private List<IAttack> attackList = new ArrayList<>();

    public Pikachu()
    {
        super(1, 22.6, "Electric", 30, 45);
        attackList.add(new ThunderBolt());
        attackList.add(new IronTail());
    }


    @Override
    public List<IAttack> getAttacks()
    {
        return this.attackList;
    }

    @Override
    public String getName()
    {
        return "Pikachu";
    }

    @Override
    public String getSound()
    {
        return "Pika Pika";
    }

    public void heal()
    {

    }
}
