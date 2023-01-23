package org.iliaglaz.pattern.character;

import org.iliaglaz.pattern.behavior.FightStyle;
import org.iliaglaz.pattern.behavior.MovementStyle;

public class Hero {

    private final MovementStyle movementStyle;
    private final FightStyle fightStyle;

    public Hero(MovementStyle movementStyle, FightStyle fightStyle) {
        this.movementStyle = movementStyle;
        this.fightStyle = fightStyle;
    }

    public void onRide() {
        movementStyle.move();
    }

    public void onFight() {
        fightStyle.fight();
    }

    public MovementStyle getMovementStyle() {
        return movementStyle;
    }

    public FightStyle getFightStyle() {
        return fightStyle;
    }
}
