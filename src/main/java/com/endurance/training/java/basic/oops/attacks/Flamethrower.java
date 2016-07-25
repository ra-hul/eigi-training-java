package com.endurance.training.java.basic.oops.attacks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class Flamethrower implements IAttack
{
    @Override
    public double getStrength()
    {
        return 45;
    }

    @Override
    public void doAttack()
    {
        System.out.println("Wooosh");
    }

    @Override
    public List<String> getEffectiveAgainstTypes()
    {
        return Arrays.asList("Earth","Electric");
    }

    @Override
    public double getStaminaRequired()
    {
        return 8;
    }
}
