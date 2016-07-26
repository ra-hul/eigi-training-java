package com.endurance.training.java.basic.oops.attacks;

import java.util.List;

/**
 * Created by rahul.go on 25/07/16.
 */
public interface IAttack
{
    default double getStrength()
    {
        return 0;
    }

    void doAttack();

    List<String> getEffectiveAgainstTypes();

    double getStaminaRequired();
}
