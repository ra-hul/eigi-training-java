package com.endurance.training.java.basic.oops.attacks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class WaterGun implements IAttack
{
    @Override
    public double getStrength()
    {
        return 46;
    }

    @Override
    public String doAttack()
    {
        return "Woosh..";
    }

    @Override
    public List<String> getEffectiveAgainstTypes()
    {
        return Arrays.asList("Earth","Fire","Air");
    }

    @Override
    public double getStaminaRequired()
    {
        return 3;
    }
}
