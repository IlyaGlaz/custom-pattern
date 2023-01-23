package org.iliaglaz.pattern.service;

import org.iliaglaz.pattern.character.Hero;
import org.iliaglaz.pattern.forge.Movement;
import org.iliaglaz.pattern.forge.Weapon;

public class HeroService {

    private static final HeroService INSTANCE = new HeroService();
    private Hero hero;

    private HeroService() {
    }

    public static HeroService getInstance() {
        return INSTANCE;
    }

    public void build(String movement, String weapon) {
        hero = new Hero(Movement.of(movement), Weapon.of(weapon));
        hero.onRide();
        hero.onFight();
    }

    public Hero getHero() {
        return hero;
    }
}
