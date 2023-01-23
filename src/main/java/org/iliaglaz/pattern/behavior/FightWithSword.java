package org.iliaglaz.pattern.behavior;

public class FightWithSword implements FightStyle{

    public String action;

    @Override
    public void fight() {
        action = "Sword is a best friend for good warrior";
    }

    public String getAction() {
        return action;
    }
}
