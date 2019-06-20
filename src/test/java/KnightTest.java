import Fighters.Knight;
import elements.Element;
import org.junit.Before;
import org.junit.Test;
import weapons.Pillow;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Pillow pillow;

    @Before
    public void before(){
        sword = new Sword();
        pillow = new Pillow();
        knight = new Knight(pillow);
    }

    @Test
    public void hasElement(){
        assertEquals(Element.STEAL, knight.getElement());
    }

    @Test
    public void canSetWeapon(){

        assertEquals(pillow, knight.getWeapon());
        knight.setWeapon(sword);
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void weaponBonusWorks(){
        assertEquals(0, knight.getWeaponBonus());
        knight.setWeapon(sword);
        assertEquals(10, knight.getWeaponBonus());
    }

    @Test
    public void damageToEnemyCalculatorWorks(){
        assertEquals(4, knight.damageToEnemyCalculator());
        knight.setWeapon(sword);
        assertEquals(17, knight.damageToEnemyCalculator());

    }

    @Test
    public void hasHealth(){
        assertEquals(2, knight.getHealth());
    }

}
