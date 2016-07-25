package com.endurance.training.java.basic.oops.attacks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class ThunderBolt implements IAttack
{
    @Override
    public String doAttack()
    {
        return "Bzzz..Bzzz..";
    }

    @Override
    public List<String> getEffectiveAgainstTypes()
    {
        return Arrays.asList("Water", "Air", "Grass");
    }

    @Override
    public double getStaminaRequired()
    {
        return 5;
    }

    @Override
    public double getStrength()
    {
        return 45.5;
    }
}
