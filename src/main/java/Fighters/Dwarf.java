package Fighters;

import elements.Element;
import weapons.Weapon;

public class Dwarf extends Fighter {
    public Dwarf(Weapon weapon) {
        super(2, weapon, 0, Element.EARTH);
    }
}
