package org.iliaglaz.pattern.behavior;

public class FightWithBow implements FightStyle{

    public String action;

    @Override
    public void fight() {
        action = "Hit them on a distance, I am an Elf. Ta-ta-ta-ta-ta";
    }

    public String getAction() {
        return action;
    }
}
