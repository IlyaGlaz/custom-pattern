package org.iliaglaz.pattern.behavior;

public class MovingOnFeet implements MovementStyle {

    public String action;

    @Override
    public void move() {
        action = "I am tired";
    }

    public String getAction() {
        return action;
    }
}
