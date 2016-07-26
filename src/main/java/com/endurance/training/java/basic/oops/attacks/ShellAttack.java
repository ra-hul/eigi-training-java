package com.endurance.training.java.basic.oops.attacks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class ShellAttack implements IAttack
{
    @Override
    public double getStrength()
    {
        return 23;
    }

    @Override
    public void doAttack()
    {
        System.out.println("Dooing!");
    }

    @Override
    public List<String> getEffectiveAgainstTypes()
    {
        return Arrays.asList("Earth","Electric");
    }

    @Override
    public double getStaminaRequired()
    {
        return 12;
    }
}
