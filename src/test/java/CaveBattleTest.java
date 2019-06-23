import Fighters.Barbarian;
import Fighters.Dwarf;
import Fighters.Knight;
import creatures.PigOfJustice;
import enemy.stuff.ChickEnemy;
import enemy.stuff.TheBlackKnight;
import enemy.stuff.*;
import org.junit.Before;
import org.junit.Test;
import room.stuff.BattleArena;
import weapons.Pillow;
import weapons.Sword;

import static org.junit.Assert.assertEquals;


public class CaveBattleTest {

        Pillow pillow;
        Sword sword;
        WeakEnemy weakEnemey;
        Knight knight;
        BattleArena battleArena;
        TheBlackKnight theBlackKnight;
        Barbarian barbarian;
        ChickEnemy chickEnemy;
        Dwarf dwarf;
        PigOfJustice pigOfJustice;
        Ballrog ballrog;

        @Before
        public void before() {
            pillow = new Pillow();
            sword = new Sword();
            weakEnemey = new WeakEnemy();
            knight = new Knight(pillow);
            theBlackKnight = new TheBlackKnight();
            barbarian = new Barbarian(pillow);
            chickEnemy = new ChickEnemy();
            dwarf = new Dwarf(sword);
            pigOfJustice = new PigOfJustice();
            ballrog = new Ballrog();
            battleArena = new BattleArena(ballrog, dwarf);

        }

        @Test
        public void oneRoundCaveFightVDwarf(){
            pigOfJustice.giveHealthBoost(dwarf);
            assertEquals("Next round:", battleArena.roundOfFighting());
            assertEquals("Next round:", battleArena.roundOfFighting());
            assertEquals("Enemy Defeated", battleArena.roundOfFighting());


        }

        @Test
         public void oneRoundCaveFightVKnight() {
            pigOfJustice.giveHealthBoost(knight);
            battleArena = new BattleArena(ballrog, knight);
            assertEquals("Next round:", battleArena.roundOfFighting());
            assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());

        }


        @Test
        public void givesHealthBoost(){
            pigOfJustice.giveHealthBoost(dwarf);
            assertEquals(12, dwarf.getHealth());
        }
    }


