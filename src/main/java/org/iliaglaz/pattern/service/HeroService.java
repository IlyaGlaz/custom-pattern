package org.iliaglaz.pattern.service;

import org.iliaglaz.pattern.character.Hero;
import org.iliaglaz.pattern.forge.Movement;
import org.iliaglaz.pattern.forge.Weapon;

public class HeroService {

    private static Hero hero;

    public static void build(String movement, String weapon) {
        hero = new Hero(Movement.of(movement), Weapon.of(weapon));
    }

    public static Hero getHero() {
        return hero;
    }
}
