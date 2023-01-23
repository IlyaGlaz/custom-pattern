package org.iliaglaz.pattern.behavior;

public class MovingOnHorse implements MovementStyle {

    public String action;

    @Override
    public void move() {
        action = "I am a knight";
    }

    public String getAction() {
        return action;
    }
}
