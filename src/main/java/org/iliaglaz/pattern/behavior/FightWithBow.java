package org.iliaglaz.pattern.behavior;

public class FightWithBow implements FightStyle{

    public String action;

    @Override
    public void fight() {
        action = "Hit them on a distance";
    }

    public String getAction() {
        return action;
    }
}
