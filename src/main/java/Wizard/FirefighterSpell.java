package Wizard;

import elements.Element;

import interfaces.IEnchantable;

import Fighters.*;


public class FirefighterSpell implements ISpell {

    public void enchant(IEnchantable enchantable) {
        if (enchantable.getElement() == Element.FIRE){
           enchantable.enchant(12);
        }
    }


}
