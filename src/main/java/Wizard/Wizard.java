package Wizard;


import interfaces.IEnchantable;

import java.util.ArrayList;

public class Wizard {

//  has one spell he or she can utilize at the start of a battle, that effects the element of combatant
    private ArrayList<ISpell> spells;
    ISpell spell;


    public Wizard() {
        spells = new ArrayList<ISpell>();
    }

    public boolean spellsContains(ISpell spell) {
        return this.spells.contains(spell);
    }

    public void addSpells(ISpell spell){
        this.spells.add(spell);
    }

    public int spellsSize(){
        return this.spells.size();
    }

    public void castSpell(ISpell spell, IEnchantable enchantable){
        if(this.spellsContains(spell)){
            spell.enchant(enchantable);
        }
    }


}
