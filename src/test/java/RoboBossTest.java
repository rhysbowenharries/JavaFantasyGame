import Fighters.Barbarian;
import Fighters.Dwarf;
import Fighters.Knight;
import creatures.PigOfJustice;
import enemy.stuff.ChickEnemy;
import enemy.stuff.RoboBoss;
import enemy.stuff.TheBlackKnight;
import enemy.stuff.WeakEnemy;
import org.junit.Before;
import org.junit.Test;
import room.stuff.BattleArena;
import weapons.Pillow;
import weapons.Sword;
import weapons.WaterBalloon;

import static org.junit.Assert.assertEquals;

public class RoboBossTest {

    RoboBoss roboBoss;
    Sword sword;
    WaterBalloon waterBalloon;
    Knight knight;
    Pillow pillow;
    PigOfJustice pigOfJustice;
    BattleArena battleArena;
    Dwarf dwarf;

    @Before
    public void before(){
        sword = new Sword();
        dwarf = new Dwarf(sword);
        pillow = new Pillow();
        knight = new Knight(pillow);
        roboBoss = new RoboBoss();
        battleArena = new BattleArena(roboBoss, knight);
        pigOfJustice = new PigOfJustice();

    }

    @Test
    public void KnightVRoboBoss(){
        knight.setWeapon(sword);
        knight.levelUp();
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());
    }

    @Test
    public void DwarfVRoboBoss(){
        dwarf = new Dwarf(sword);
        dwarf.levelUp();
        pigOfJustice.giveHealthBoost(dwarf);
        battleArena = new BattleArena(roboBoss, dwarf);
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());
    }
    @Test
    public void WaterballoonVRoboBoss(){
        waterBalloon = new WaterBalloon();
        dwarf = new Dwarf(waterBalloon);
        dwarf.levelUp();
        battleArena = new BattleArena(roboBoss, dwarf);
        assertEquals("Enemy Defeated", battleArena.roundOfFighting());

    }


}
