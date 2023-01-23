package org.iliaglaz.pattern.behavior;

public class FightWithWand implements FightStyle{

    public String action;

    @Override
    public void fight() {
        action = "Now you are a helpless frog";
    }

    public String getAction() {
        return action;
    }
}
