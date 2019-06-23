package Fighters;

import elements.Element;
import weapons.Weapon;

public class Barbarian extends Fighter {
    public Barbarian(Weapon weapon) {
        super(4, weapon, 0, Element.FIRE);
    }
}
