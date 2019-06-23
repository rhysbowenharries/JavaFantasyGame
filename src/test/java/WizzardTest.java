import Fighters.Barbarian;
import Fighters.Dwarf;
import Wizard.*;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WizzardTest {

    Wizard wizard;
    Barbarian barbarian;
    Dwarf dwarf;
    FirefighterSpell firefighterSpell;
    Sword sword;


    @Before
    public void before(){
        sword = new Sword();
        wizard = new Wizard();
        barbarian = new Barbarian(sword);
        dwarf = new Dwarf(sword);
        firefighterSpell = new FirefighterSpell();

    }

    @Test
    public void canAddToSpells(){
        assertEquals(0, wizard.spellsSize());
        wizard.addSpells(firefighterSpell);
        assertEquals(true, wizard.spellsContains(firefighterSpell));

    }

    @Test
    public void canCastSpell(){
        wizard.addSpells(firefighterSpell);
        assertEquals(8, barbarian.damageToEnemyCalculator());
        wizard.castSpell(firefighterSpell, barbarian);
        assertEquals(20, barbarian.damageToEnemyCalculator());
    }

    @Test
    public void fireElementSpellNoWorkOnDwarf(){
        wizard.addSpells(firefighterSpell);
        wizard.castSpell(firefighterSpell, dwarf);
        assertEquals(8, barbarian.damageToEnemyCalculator());
    }
}
