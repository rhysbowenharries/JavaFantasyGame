import Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Sword sword;

    @Before
    public void before(){
        sword = new Sword();
        dwarf = new Dwarf(sword);


    }

    @Test
    public void getDamageCalculation(){
        assertEquals(6, dwarf.damageToEnemyCalculator());
    }

}
