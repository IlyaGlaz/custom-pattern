package org.iliaglaz.pattern.behavior;

public class FightWithBow implements FightStyle{

    @Override
    public void fight() {
        System.out.println("Hit them on a distance");
    }
}
