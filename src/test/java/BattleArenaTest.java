import Fighters.*;
import enemy.stuff.*;
import org.junit.Before;
import org.junit.Test;
import room.stuff.BattleArena;
import room.stuff.ChickenRoom;
import room.stuff.KnightRoom;
import weapons.*;


import static org.junit.Assert.assertEquals;

public class BattleArenaTest {

    Pillow pillow;
    Sword sword;
    WeakEnemy weakEnemey;
    Knight knight;
    BattleArena battleArena;
    TheBlackKnight theBlackKnight;
    Barbarian barbarian;
    ChickEnemy chickEnemy;
    Dwarf dwarf;
    ChickenRoom chickenRoom;
    KnightRoom knightRoom;

    @Before
    public void before(){
        pillow = new Pillow();
        sword = new Sword();
        weakEnemey = new WeakEnemy();
        dwarf = new Dwarf(pillow);
        knight = new Knight(pillow);
        battleArena = new BattleArena(weakEnemey, knight);
        theBlackKnight = new TheBlackKnight();
        barbarian = new Barbarian(pillow);
        chickEnemy = new ChickEnemy();
        chickenRoom = new ChickenRoom();
        knightRoom = new KnightRoom();
    }

    @Test
    public void enemyTakesDamage(){
        assertEquals(4, weakEnemey.getHealth());
        battleArena.fighterAttacks();
        assertEquals(0, weakEnemey.getHealth());
    }

    @Test
    public void fighterTakesDamage(){
        battleArena.enemyAttacks();
        assertEquals(1, knight.getHealth());
    }

    @Test
    public void battleEndsIfEnemyHasNoHealth(){
        assertEquals("Monster Looks Angry", battleArena.enemyDefeated());
        battleArena.fighterAttacks();
        assertEquals("Enemy Defeated", battleArena.enemyDefeated());
    }

    @Test
    public void fightWorksEnemyDiesOneHit(){
        assertEquals("Enemy Defeated", battleArena.roundOfFighting());
    }

    @Test
    public void fightWorksEnemyDiesTwoHit(){
        knight.setWeapon(sword);
        battleArena = new BattleArena(theBlackKnight, knight);
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("Enemy Defeated", battleArena.roundOfFighting());

        //have to set weapon to get weapon bonus

    }

    @Test
    public void fightWorksYouDieTwoHit() {
        knight = new Knight(sword);
        battleArena = new BattleArena(theBlackKnight, knight);
        assertEquals("Next round:", battleArena.roundOfFighting());
        assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());
    }

    @Test
    public void chickEnemyVSBarbarian(){
        barbarian = new Barbarian(pillow);
        battleArena = new BattleArena(chickEnemy, barbarian);
        assertEquals("Enemy Defeated", battleArena.roundOfFighting());
    }

    @Test
    public void chickEnemyVSKnight(){
        barbarian = new Barbarian(pillow);
        battleArena = new BattleArena(chickEnemy, knight);
        assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());
    }

    @Test
    public void chickEnemyVSDwarf(){
        dwarf = new Dwarf(pillow);
        battleArena = new BattleArena(chickEnemy, dwarf);
        assertEquals("You are defeated. GAME OVER", battleArena.roundOfFighting());
    }

    @Test
    public void canBattleDwarf(){
        chickenRoom.battle(dwarf);
    }

    @Test
    public void canBattleKNight(){
        chickenRoom.battle(knight);
    }

    @Test
    public void canBattleBarbarian(){
        chickenRoom.battle(barbarian);
    }

    @Test
    public void blackKnightVDwarf(){
        knightRoom.battle(dwarf);
        knightRoom.battle(dwarf);
    }

    @Test
    public void blackKnightVBarbarian(){
        knightRoom.battle(barbarian);
        knightRoom.battle(barbarian);
    }
    @Test
    public void blackKnightVKnight() {
        knightRoom.battle(knight);
        knightRoom.battle(knight);
    }
}
