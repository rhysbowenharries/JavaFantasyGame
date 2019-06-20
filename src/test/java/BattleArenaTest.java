import Fighters.Knight;
import enemy.stuff.ChickEnemey;
import org.junit.Before;
import org.junit.Test;
import room.stuff.BattleArena;
import weapons.Pillow;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BattleArenaTest {

    Pillow pillow;
    Sword sword;
    ChickEnemey chickEnemey;
    Knight knight;
    BattleArena battleArena;

    @Before
    public void before(){
        pillow = new Pillow();
        sword = new Sword();
        chickEnemey = new ChickEnemey();
        knight = new Knight(pillow);
        battleArena = new BattleArena(chickEnemey, knight);
    }

    @Test
    public void enemyTakesDamage(){
        assertEquals(4, chickEnemey.getHealth());
        battleArena.fighterAttcks();
        assertEquals(0, chickEnemey.getHealth());
    }

    @Test
    public void fighterTakesDamage
}
