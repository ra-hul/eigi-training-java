package com.endurance.training.java.basic.oops.attacks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public class IronTail implements IAttack
{
    @Override
    public double getStrength()
    {
        return 50;
    }

    @Override
    public String doAttack()
    {
        return "bang!";
    }

    @Override
    public List<String> getEffectiveAgainstTypes()
    {
        return Arrays.asList("Earth","Water","Fire");
    }

    @Override
    public double getStaminaRequired()
    {
        return 7;
    }
}
