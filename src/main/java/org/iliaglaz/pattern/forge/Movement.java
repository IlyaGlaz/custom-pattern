package org.iliaglaz.pattern.forge;

import org.iliaglaz.pattern.behavior.*;

public class Movement {

    public static MovementStyle of(String movement) {
        MovementStyle style = null;
        if (movement.equals("Horse")) {
            style = new MovingOnHorse();
        } else if (movement.equals("Feet")) {
            style = new MovingOnFeet();
        }
        return style;
    }
}
