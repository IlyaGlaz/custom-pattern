package org.iliaglaz.pattern.forge;

import org.iliaglaz.pattern.behavior.FightStyle;
import org.iliaglaz.pattern.behavior.FightWithBow;
import org.iliaglaz.pattern.behavior.FightWithSword;
import org.iliaglaz.pattern.behavior.FightWithWand;

public class Weapon {

    public static FightStyle of(String weapon) {
        FightStyle style = null;
        if (weapon.equals("Sword")) {
            style = new FightWithSword();
        } else if (weapon.equals("Bow")) {
            style = new FightWithBow();
        } else if (weapon.equals("Wand")) {
            style = new FightWithWand();
        }
        return style;
    }
}
