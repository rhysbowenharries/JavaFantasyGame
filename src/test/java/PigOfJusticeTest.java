import Fighters.Dwarf;
import Fighters.Knight;
import creatures.PigOfJustice;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PigOfJusticeTest {

    PigOfJustice pigOfJustice;
    Dwarf dwarf;
    Knight knight;
    Sword sword;

    @Before
    public void before(){
        pigOfJustice = new PigOfJustice();
        dwarf = new Dwarf(sword);
        knight = new Knight(sword);

    }

    @Test
    public void canGiveHealthBoostDwarf(){
        pigOfJustice.giveHealthBoost(dwarf);
        assertEquals(12, dwarf.getHealth());
    }

    @Test
    public void cantGiveHealthBoostKnight(){
        pigOfJustice.giveHealthBoost(knight);
        assertEquals(2, knight.getHealth());
    }
}
