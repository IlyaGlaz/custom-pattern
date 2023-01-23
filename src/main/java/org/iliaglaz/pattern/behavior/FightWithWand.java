package org.iliaglaz.pattern.behavior;

public class FightWithWand implements FightStyle{

    @Override
    public void fight() {
        System.out.println("Now you are a helpless frog");
    }
}
